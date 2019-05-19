package br.com.biblioteca.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(generator = "project_generator")
    @SequenceGenerator(
            name = "project_generator",
            sequenceName = "project_sequence",
            initialValue = 1000
    )
    private int id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="data_inicio")
    private Date dataInicio;


    @Column(name="data_previsao_fim")
    private Date dataPrevisaoFim;

    @Column(name="data_fim")
    private Date dataFim;


    @Column(name="descricao")
    private String descricao;

    private String status;

    private float orcamento;

    private String risco;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idgerente", nullable = false)
    private Person gerente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataPrevisaoFim() {
        return dataPrevisaoFim;
    }

    public void setDataPrevisaoFim(Date dataPrevisaoFim) {
        this.dataPrevisaoFim = dataPrevisaoFim;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
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

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public Person getGerente() {
        return gerente;
    }

    public void setGerente(Person gerente) {
        this.gerente = gerente;
    }
}
