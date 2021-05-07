package br.com.sistema.service;

import br.com.sistema.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    //metodo de consulta
    public List<Funcionario> findAll();
    public Funcionario findById(Long id);

    //metodo de erro/alerta
    public Funcionario findByEmail(String email);
    public Funcionario findByNome(String nome);
    public String validarFuncionario(Funcionario funcionario);

    //metodo de salvar e deletar
    public boolean save(Funcionario funcionario);
    public boolean deleteById(Long id);

}
