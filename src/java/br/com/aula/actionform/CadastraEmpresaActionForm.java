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
public class CadastraEmpresaActionForm extends org.apache.struts.action.ActionForm {

    private String nome;
    private String cnpj;

    public CadastraEmpresaActionForm() {
        super();
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
        if (getNome() == null || getNome().length() < 1) {
            errors.add("nome", new ActionMessage("error.nome.required"));
        }
        if (getCnpj() == null || getCnpj().length() < 1) {
            errors.add("cnpj", new ActionMessage("error.cnpj.required"));
        }
        return errors;
    }

}
