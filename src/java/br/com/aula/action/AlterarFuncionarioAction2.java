/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Departamento;
import br.com.aula.Funcionario;
import br.com.aula.actionform.AlterarFuncionarioActionForm;
import br.com.aula.dao.DepartamentoDAO;
import br.com.aula.dao.FuncionarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarFuncionarioAction2 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlterarFuncionarioActionForm formBean = (AlterarFuncionarioActionForm) form;
        DepartamentoDAO dao = new DepartamentoDAO();
        Departamento departamento = dao.consultarDepartamentoPorId(formBean.getDepartamento());
        Funcionario funcionario = new Funcionario(
                formBean.getId(),
                departamento,
                formBean.getNome(),
                formBean.getFuncao(),
                formBean.getRegistro(),
                formBean.getCpf(),
                formBean.getFumante(),
                formBean.getPai(),
                formBean.getMae()
        );
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        System.out.println("Passei aqui");
        funcionarioDAO.alterarFuncionario(funcionario);
        formBean.setId(0);
        formBean.setDepartamento(0);
        formBean.setNome("");
        formBean.setFuncao("");
        formBean.setRegistro("");
        formBean.setCpf("");
        formBean.setFumante("");
        formBean.setPai("");
        formBean.setMae("");
        return mapping.findForward(SUCCESS);
    }
}
