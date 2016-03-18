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
public class AlterarEmpresaAction2 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlteraEmpresaActionForm formBean = (AlteraEmpresaActionForm) form;
        Empresa empresa = new Empresa(
                formBean.getId(),
                formBean.getNome(),
                formBean.getCnpj()
        );
        EmpresaDAO empresaDAO = new EmpresaDAO();
        System.out.println("Passei aqui");
        empresaDAO.alterarEmpresa(empresa);
        formBean.setId(0);
        formBean.setNome("");
        formBean.setCnpj("");
        return mapping.findForward(SUCCESS);
    }
}
