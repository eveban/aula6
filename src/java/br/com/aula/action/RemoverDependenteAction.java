package br.com.aula.action;

import br.com.aula.Dependente;
import br.com.aula.actionform.RemoverDependenteActionForm;
import br.com.aula.dao.DependenteDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RemoverDependenteAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RemoverDependenteActionForm formBean = (RemoverDependenteActionForm) form;
        DependenteDAO dependenteDAO = new DependenteDAO();
        Dependente dependente = dependenteDAO.consultarDependentePorId(formBean.getId());
        if (dependente != null) {
            dependenteDAO.removerDependente(dependente);
        }
        return mapping.findForward(SUCCESS);
    }
}
