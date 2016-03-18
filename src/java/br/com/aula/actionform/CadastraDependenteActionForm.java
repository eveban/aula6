/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.actionform;

import br.com.aula.Funcionario;
import br.com.aula.dao.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author everson
 */
public class CadastraDependenteActionForm extends org.apache.struts.action.ActionForm {

    private String nome;
    private String rg;
    private String cpf;
    private String parentesco;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private int funcionario;

    public CadastraDependenteActionForm() {
        super();
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

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getFuncionarios() {
        FuncionarioDAO dao = new FuncionarioDAO();
        this.funcionarios = dao.listarTodosFuncionarios();
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNome() == null || getNome().length() < 1) {
            errors.add("nome", new ActionMessage("error.nome.required"));
        }
        if (getParentesco() == null || getParentesco().length() < 1) {
            errors.add("parentesco", new ActionMessage("error.parentesco.required"));
        }
        return errors;
    }

}
