package br.com.aula.action;

import br.com.aula.Funcionario;
import br.com.aula.Dependente;
import br.com.aula.actionform.CadastraDependenteActionForm;
import br.com.aula.dao.FuncionarioDAO;
import br.com.aula.dao.DependenteDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CadastraDependenteAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        CadastraDependenteActionForm formBean = (CadastraDependenteActionForm) form;
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionario = dao.consultarFuncionarioPorId(formBean.getFuncionario());
        Dependente dependente = new Dependente(funcionario,
                formBean.getNome(),
                formBean.getCpf(),
                formBean.getRg(),
                formBean.getParentesco());
        DependenteDAO dependenteDAO = new DependenteDAO();
        dependenteDAO.inserirDependente(dependente);
        return mapping.findForward(SUCCESS);
    }
}
