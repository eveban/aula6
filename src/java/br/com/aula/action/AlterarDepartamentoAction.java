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
public class AlterarDepartamentoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlteraDepartamentoActionForm formBean = (AlteraDepartamentoActionForm) form;
        DepartamentoDAO dao = new DepartamentoDAO();
        Departamento departamento = dao.consultarDepartamentoPorId(formBean.getId());
        if (departamento != null) {
            formBean.setId(departamento.getId());
            formBean.setNome(departamento.getNome());
            formBean.setLocal(departamento.getLocal());
            formBean.setDescricao(departamento.getDescricao()
            );
        }

        return mapping.findForward(SUCCESS);
    }
}
