package br.com.aula.action;

import br.com.aula.Funcionario;
import br.com.aula.Departamento;
import br.com.aula.actionform.CadastraDepartamentoActionForm;
import br.com.aula.dao.FuncionarioDAO;
import br.com.aula.dao.DepartamentoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CadastraDepartamentoAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        CadastraDepartamentoActionForm formBean = (CadastraDepartamentoActionForm) form;
        Departamento departamento = new Departamento(
                null,
                formBean.getNome(),
                formBean.getLocal(),
                formBean.getDescricao());
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        departamentoDAO.inserirDepartamento(departamento);
        return mapping.findForward(SUCCESS);
    }
}
