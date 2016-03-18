/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula;

import java.io.Serializable;

/**
 *
 * @author everson
 */
public class Dependente implements Serializable {

    private Integer id;
    private Funcionario funcionario;
    private String nome;
    private String rg;
    private String cpf;
    private String parentesco;

    public Dependente() {

    }

    public Dependente(Funcionario funcionario, String nome, String rg, String cpf, String parentesco) {
        this.funcionario = funcionario;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.parentesco = parentesco;
    }

    public Dependente(Integer id, Funcionario funcionario, String nome, String rg, String cpf, String parentesco) {
        this.id = id;
        this.funcionario = funcionario;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.parentesco = parentesco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

}
