package br.com.biblioteca.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pessoa")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Date datanascimento;
    private String cpf;
    private boolean funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }
}
