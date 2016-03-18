/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Empresa;
import br.com.aula.actionform.ListarEmpresasActionForm;
import br.com.aula.dao.EmpresaDAO;
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
public class ListarEmpresasAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ListarEmpresasActionForm formBean = (ListarEmpresasActionForm) form;
        EmpresaDAO dao = new EmpresaDAO();
        List<Empresa> empresas = dao.listarTodosEmpresas();
        formBean.setEmpresas(empresas);
        return mapping.findForward(SUCCESS);
    }
}
