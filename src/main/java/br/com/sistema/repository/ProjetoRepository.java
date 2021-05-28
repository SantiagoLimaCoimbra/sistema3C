package br.com.sistema.repository;

import br.com.sistema.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    public Projeto findByNome(String nome);
    public Projeto findByIdNotAndNome(Long id, String nome);
}
