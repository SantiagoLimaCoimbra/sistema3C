package br.com.sistema.service;

import br.com.sistema.model.Projeto;
import br.com.sistema.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoServiceImple implements ProjetoService {
    @Autowired
    ProjetoRepository projetoRepository;

    @Override
    public List<Projeto> findAll() {
        return projetoRepository.findAll(Sort.by("nome"));
    }

    @Override
    public Projeto findById(Long id){
        return projetoRepository.findById(id).get();
    }

    @Override
    public Projeto findByNome(String nome) {
        return projetoRepository.findByNome(nome);
    }

    @Override
    public String validarProjeto(Projeto projeto){
        String error = null;
        Projeto p;

        if(projeto.getId() == null){
            p = projetoRepository.findByNome(projeto.getNome());
            if(p != null){
                error = "Projeto já existente!";
            }
        } else {
            p = projetoRepository.findByIdNotAndNome(projeto.getId(), projeto.getNome());
            if(p != null){
                error = "Projeto já existente!";
            }
        }
        return error;
    }

    @Override
    public boolean save(Projeto projeto) {
        try {
            projetoRepository.save(projeto);
            return true;
        } catch (Exception e) {
            return false;
            //"Erro ao salvar o projeto. " + e.getMessage();
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            projetoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao deletar. " + e.getMessage());
            return false;
        }
    }
}
