/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Dependente;
import br.com.aula.actionform.AlteraDependenteActionForm;
import br.com.aula.dao.DependenteDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarDependenteAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlteraDependenteActionForm formBean = (AlteraDependenteActionForm) form;
        DependenteDAO dao = new DependenteDAO();
        Dependente dependente = dao.consultarDependentePorId(formBean.getId());
        if (dependente != null) {
            formBean.setId(dependente.getId());
            formBean.setFuncionario(dependente.getFuncionario().getId());
            formBean.setNome(dependente.getNome());
            formBean.setRg(dependente.getRg());
            formBean.setCpf(dependente.getCpf());
            formBean.setParentesco(dependente.getParentesco()
            );
        }

        return mapping.findForward(SUCCESS);
    }
}
