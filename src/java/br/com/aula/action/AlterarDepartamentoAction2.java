/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Departamento;
import br.com.aula.actionform.AlteraDepartamentoActionForm;
import br.com.aula.dao.DepartamentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarDepartamentoAction2 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlteraDepartamentoActionForm formBean = (AlteraDepartamentoActionForm) form;
        Departamento departamento = new Departamento(
                formBean.getId(),
                formBean.getNome(),
                formBean.getLocal(),
                formBean.getDescricao()
        );
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        System.out.println("Passei aqui");
        departamentoDAO.alterarDepartamento(departamento);
        formBean.setId(0);
        formBean.setNome("");
        formBean.setLocal("");
        formBean.setDescricao("");
        return mapping.findForward(SUCCESS);
    }
}
