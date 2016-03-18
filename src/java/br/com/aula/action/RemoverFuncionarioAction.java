package br.com.aula.action;

import br.com.aula.Funcionario;
import br.com.aula.actionform.RemoverFuncionarioActionForm;
import br.com.aula.dao.FuncionarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RemoverFuncionarioAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RemoverFuncionarioActionForm formBean = (RemoverFuncionarioActionForm) form;
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.consultarFuncionarioPorId(formBean.getId());
        if (funcionario != null) {
            funcionarioDAO.removerFuncionario(funcionario);
        }
        return mapping.findForward(SUCCESS);
    }
}
