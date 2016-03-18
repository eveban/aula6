/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.actionform.LoginActionForm;
import br.com.aula.dao.LoginDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 *
 * @author everson
 */
public class LoginAction extends Action {

    private static final String SUCCESS = "success";
    private static final String FALHA = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ActionErrors errors = new ActionErrors();
        LoginActionForm loginForm = (LoginActionForm) form;
        LoginDAO dao = new LoginDAO();

        if (dao.buscar(loginForm.getLogin(), loginForm.getSenha())) {
            return mapping.findForward(SUCCESS);
        } else {
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("error.dynamic", "Usuário ou senha inválidos."));
            saveMessages(request, messages);
            return mapping.findForward(FALHA);
        }
    }
}
