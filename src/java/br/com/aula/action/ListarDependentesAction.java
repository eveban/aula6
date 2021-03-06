/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Dependente;
import br.com.aula.actionform.ListarDependentesActionForm;
import br.com.aula.dao.DependenteDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class ListarDependentesAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ListarDependentesActionForm formBean = (ListarDependentesActionForm) form;
        DependenteDAO dao = new DependenteDAO();
        List<Dependente> dependentes = dao.listarTodosDependentes();
        formBean.setDependentes(dependentes);
        return mapping.findForward(SUCCESS);
    }
}
