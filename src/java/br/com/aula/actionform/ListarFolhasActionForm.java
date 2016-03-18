/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.actionform;

import br.com.aula.Folha;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class ListarFolhasActionForm extends org.apache.struts.action.ActionForm {

    private List<Folha> folhas;

    public ListarFolhasActionForm() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        return errors;
    }

    public List<Folha> getFolhas() {
        return folhas;
    }

    public void setFolhas(List<Folha> folhas) {
        this.folhas = folhas;
    }

}
