package br.com.aula.action;

import br.com.aula.Folha;
import br.com.aula.actionform.RemoverFolhaActionForm;
import br.com.aula.dao.FolhaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RemoverFolhaAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RemoverFolhaActionForm formBean = (RemoverFolhaActionForm) form;
        FolhaDAO folhaDAO = new FolhaDAO();
        Folha folha = folhaDAO.consultarFolhaPorId(formBean.getId());
        if (folha != null) {
            folhaDAO.removerFolha(folha);
        }
        return mapping.findForward(SUCCESS);
    }
}
