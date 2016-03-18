/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Empresa;
import br.com.aula.actionform.AlteraEmpresaActionForm;
import br.com.aula.dao.EmpresaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarEmpresaAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlteraEmpresaActionForm formBean = (AlteraEmpresaActionForm) form;
        EmpresaDAO dao = new EmpresaDAO();
        Empresa empresa = dao.consultarEmpresaPorId(formBean.getId());
        if (empresa != null) {
            formBean.setId(empresa.getId());
            formBean.setNome(empresa.getNome());
            formBean.setCnpj(empresa.getCnpj());
        }

        return mapping.findForward(SUCCESS);
    }
}
