package br.com.aula.action;

import br.com.aula.Departamento;
import br.com.aula.actionform.RemoverDepartamentoActionForm;
import br.com.aula.dao.DepartamentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RemoverDepartamentoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RemoverDepartamentoActionForm formBean = (RemoverDepartamentoActionForm) form;
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        Departamento departamento = departamentoDAO.consultarDepartamentoPorId(formBean.getId());
        if (departamento != null) {
            departamentoDAO.removerDepartamento(departamento);
        }
        return mapping.findForward(SUCCESS);
    }
}
