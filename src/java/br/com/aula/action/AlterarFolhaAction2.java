/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Empresa;
import br.com.aula.Folha;
import br.com.aula.Funcionario;
import br.com.aula.actionform.AlterarFolhaActionForm;
import br.com.aula.dao.EmpresaDAO;
import br.com.aula.dao.FolhaDAO;
import br.com.aula.dao.FuncionarioDAO;
import java.math.BigDecimal;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarFolhaAction2 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlterarFolhaActionForm formBean = (AlterarFolhaActionForm) form;

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.consultarFuncionarioPorId(formBean.getFuncionario());

        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = empresaDAO.consultarEmpresaPorId(formBean.getEmpresa());

        Folha folha = new Folha(
                formBean.getId(),
                empresa,
                funcionario,
                formBean.getInss(),
                formBean.getSindicato(),
                formBean.getAjudacusto(),
                formBean.getPlr(),
                formBean.getDecimo(),
                formBean.getPeriodo(),
                formBean.getFerias(),
                formBean.getDatapagamento(),
                formBean.getSalariofamilia(),
                formBean.getSalario()
        );
        FolhaDAO folhaDAO = new FolhaDAO();
        System.out.println("Passei aqui");
        folhaDAO.alterarFolha(folha);
        formBean.setId(0);
        formBean.setEmpresa(0);
        formBean.setFuncionario(0);
        formBean.setInss(BigDecimal.ZERO);
        formBean.setSindicato(BigDecimal.ZERO);
        formBean.setAjudacusto(BigDecimal.ZERO);
        formBean.setPlr(BigDecimal.ZERO);
        formBean.setDecimo(BigDecimal.ZERO);
        formBean.setPeriodo(0);
        formBean.setFerias("");
        formBean.setDatapagamento(new Date());
        formBean.setSalariofamilia("");
        formBean.setSalario(BigDecimal.ZERO);
        return mapping.findForward(SUCCESS);
    }
}
