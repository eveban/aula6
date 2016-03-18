/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Funcionario;
import br.com.aula.actionform.ListarFuncionariosActionForm;
import br.com.aula.dao.FuncionarioDAO;
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
public class ListarFuncionariosAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ListarFuncionariosActionForm formBean = (ListarFuncionariosActionForm) form;

        //Session session = HibernateUtil.getSessionFactory().openSession();
        //List<Funcionario> funcionarios = session.createQuery("from Funcionario").list();
        //formBean.setFuncionarios(funcionarios);
         FuncionarioDAO dao = new FuncionarioDAO();
         List<Funcionario> funcionarios = dao.listarTodosFuncionarios();
         formBean.setFuncionarios(funcionarios);
         return mapping.findForward(SUCCESS);

    }
}
