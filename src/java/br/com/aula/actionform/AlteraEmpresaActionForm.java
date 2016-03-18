/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.actionform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author everson
 */
public class AlteraEmpresaActionForm extends org.apache.struts.action.ActionForm {

    private Integer id;
    private String nome;
    private String cnpj;

    public AlteraEmpresaActionForm() {
        super();

    }

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getCnpj() == null || getCnpj().length() < 1) {
            errors.add("cnpj", new ActionMessage("error.cnpj.required"));
        }
        if (getNome() == null || getNome().length() < 1) {
            errors.add("nome", new ActionMessage("error.nome.required"));
        }
        return errors;
    }
}
