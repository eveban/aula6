/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Folha;
import br.com.aula.actionform.ListarFolhasActionForm;
import br.com.aula.dao.FolhaDAO;
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
public class ListarFolhasAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ListarFolhasActionForm formBean = (ListarFolhasActionForm) form;

        //Session session = HibernateUtil.getSessionFactory().openSession();
        //List<Folha> folhas = session.createQuery("from Folha").list();
        //formBean.setFolhas(folhas);
        FolhaDAO dao = new FolhaDAO();
        List<Folha> folhas = dao.listarTodosFolhas();
        formBean.setFolhas(folhas);
        return mapping.findForward(SUCCESS);

    }
}
