package br.com.aula.action;

import br.com.aula.Empresa;
import br.com.aula.actionform.CadastraEmpresaActionForm;
import br.com.aula.dao.EmpresaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CadastraEmpresaAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        CadastraEmpresaActionForm formBean = (CadastraEmpresaActionForm) form;
        Empresa empresa = new Empresa(
                null,
                formBean.getNome(),
                formBean.getCnpj());
        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.inserirEmpresa(empresa);
        return mapping.findForward(SUCCESS);
    }
}
