package br.com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity(name = "projeto")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max=80)
    @NotNull
    private String nome;

    @Size(max=150)
    @NotNull
    private String descricao;

    @Size(max=50)
    @NotNull
    private String status;

    @Size(max=50)
    @NotNull
    private String risco;

    @NotNull
    private double orcamento;

    @NotNull
    private Date dataInicio;

    @NotNull
    private Date dataFinal;

    /* TEM QUE FAZER
    private Funcionario gerente;
    private List<Funcionarios> funcionarios;
    */

    //GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }


    //TO STRING
    @Override
    public String toString() {
        return "Projeto = " +
                "id: " + id +
                ", nome: " + nome +
                ", descrição: " + descricao +
                ", status: " + status +
                ", risco: " + risco +
                ", orcamento: " + orcamento +
                ", dataInicio: " + dataInicio +
                ", dataFinal: " + dataFinal;
    }
}
