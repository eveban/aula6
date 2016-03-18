/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.actionform;

import br.com.aula.Departamento;
import br.com.aula.dao.DepartamentoDAO;
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
public class AlterarFuncionarioActionForm extends org.apache.struts.action.ActionForm {

    private Integer id;
    //private Departamento departamento;
    private String nome;
    private String funcao;
    private String registro;
    private String cpf;
    private String fumante;
    private String pai;
    private String mae;

    private List<Departamento> departamentos = new ArrayList<Departamento>();
    private int departamento;

    public AlterarFuncionarioActionForm() {
        super();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFumante() {
        return fumante;
    }

    public void setFumante(String fumante) {
        this.fumante = fumante;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public List<Departamento> getDepartamentos() {
        DepartamentoDAO dao = new DepartamentoDAO();
        this.departamentos = dao.listarTodosDepartamentos();
        return departamentos;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNome() == null || getNome().length() < 1) {
            errors.add("nome", new ActionMessage("error.nome.required"));
        }
        if (getFuncao() == null || getFuncao().length() < 1) {
            errors.add("funcao", new ActionMessage("error.funcao.required"));
        }
        if (getRegistro() == null || getRegistro().length() < 1) {
            errors.add("registro", new ActionMessage("error.registro.required"));
        }
        return errors;
    }
}
