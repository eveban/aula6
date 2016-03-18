/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Funcionario;
import br.com.aula.Dependente;
import br.com.aula.actionform.AlteraDependenteActionForm;
import br.com.aula.dao.FuncionarioDAO;
import br.com.aula.dao.DependenteDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarDependenteAction2 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlteraDependenteActionForm formBean = (AlteraDependenteActionForm) form;
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionario = dao.consultarFuncionarioPorId(formBean.getFuncionario());
        Dependente dependente = new Dependente(
                formBean.getId(),
                funcionario,
                formBean.getNome(),
                formBean.getCpf(),
                formBean.getRg(),
                formBean.getParentesco()
        );
        DependenteDAO dependenteDAO = new DependenteDAO();
        System.out.println("Passei aqui");
        dependenteDAO.alterarDependente(dependente);
        formBean.setId(0);
        formBean.setFuncionario(0);
        formBean.setNome("");
        formBean.setCpf("");
        formBean.setRg("");
        formBean.setCpf("");
        formBean.setParentesco("");
        return mapping.findForward(SUCCESS);
    }
}
