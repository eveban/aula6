/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.action;

import br.com.aula.Folha;
import br.com.aula.actionform.AlterarFolhaActionForm;
import br.com.aula.dao.FolhaDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author everson
 */
public class AlterarFolhaAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AlterarFolhaActionForm formBean = (AlterarFolhaActionForm) form;
        FolhaDAO folhaDAO = new FolhaDAO();
        Folha folha = folhaDAO.consultarFolhaPorId(formBean.getId());
        if (folha != null) {
            formBean.setId(folha.getId());
            formBean.setEmpresa(folha.getEmpresa().getId());
            formBean.setFuncionario(folha.getFuncionario().getId());
            formBean.setInss(folha.getInss());
            formBean.setSindicato(folha.getSindicato());
            formBean.setAjudacusto(folha.getAjudacusto());
            formBean.setPlr(folha.getPlr());
            formBean.setPeriodo(folha.getPeriodo());
            formBean.setFerias(folha.getFerias());
            formBean.setDatapagamento(folha.getDatapagamento());
            formBean.setSalariofamilia(folha.getSalariofamilia());
            formBean.setSalario(folha.getSalario());
        }

        return mapping.findForward(SUCCESS);
    }
}
