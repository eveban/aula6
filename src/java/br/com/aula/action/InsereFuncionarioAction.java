package br.com.aula.action;

import br.com.aula.Departamento;
import br.com.aula.Funcionario;
import br.com.aula.actionform.InsereFuncionarioActionForm;
import br.com.aula.dao.DepartamentoDAO;
import br.com.aula.dao.FuncionarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class InsereFuncionarioAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        InsereFuncionarioActionForm formBean = (InsereFuncionarioActionForm) form;
        DepartamentoDAO dao = new DepartamentoDAO();
        Departamento departamento = dao.consultarDepartamentoPorId(formBean.getDepartamento());
        Funcionario funcionario = new Funcionario(departamento,
                formBean.getNome(),
                formBean.getFuncao(),
                formBean.getRegistro(),
                formBean.getCpf(),
                formBean.getFumante(),
                formBean.getPai(),
                formBean.getMae());
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserirFuncionario(funcionario);
        return mapping.findForward(SUCCESS);
    }
}
