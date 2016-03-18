/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Funcionario;
import br.com.aula.actionform.AlterarFuncionarioActionForm;
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
public class AlterarFuncionarioAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlterarFuncionarioActionForm formBean = (AlterarFuncionarioActionForm) form;
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.consultarFuncionarioPorId(formBean.getId());
        if (funcionario != null) {
            formBean.setId(funcionario.getId());
            formBean.setDepartamento(funcionario.getDepartamento().getId());
            formBean.setNome(funcionario.getNome());
            formBean.setFuncao(funcionario.getFuncao());
            formBean.setRegistro(funcionario.getRegistro());
            formBean.setCpf(funcionario.getCpf());
            formBean.setFumante(funcionario.getFumante());
            formBean.setPai(funcionario.getPai());
            formBean.setMae(funcionario.getMae()
            );
        }

        return mapping.findForward(SUCCESS);
    }
}
