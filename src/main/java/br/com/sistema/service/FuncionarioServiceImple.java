package br.com.sistema.service;

import br.com.sistema.model.Funcionario;
import br.com.sistema.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImple implements FuncionarioService{

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll(Sort.by("nome"));
    }

    @Override
    public Funcionario findById(Long id) {
        return null;
    }

    @Override
    public Funcionario findByEmail(String email){
        return funcionarioRepository.findByEmail(email);
    }

    @Override
    public Funcionario findByNome(String nome){
        return funcionarioRepository.findByNome(nome);
    }

    @Override
    public boolean save(Funcionario funcionario){
        try {
            if (funcionario != null){
                funcionarioRepository.save(funcionario);
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(Long id){
        return false;
    }
}
