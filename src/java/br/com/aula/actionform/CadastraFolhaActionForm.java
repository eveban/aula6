/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.actionform;

import br.com.aula.Empresa;
import br.com.aula.Funcionario;
import br.com.aula.dao.EmpresaDAO;
import br.com.aula.dao.FuncionarioDAO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author everson
 */
public class CadastraFolhaActionForm extends org.apache.struts.action.ActionForm {

    // private Empresa empresa;
    // private Funcionario funcionario;
    private BigDecimal inss;
    private BigDecimal sindicato;
    private BigDecimal ajudacusto;
    private BigDecimal plr;
    private BigDecimal decimo;
    private Integer periodo;
    private String ferias;
    private String datapagamento;
    private String salariofamilia;
    private BigDecimal salario;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Empresa> empresas = new ArrayList<Empresa>();
    private int funcionario;
    private int empresa;

    public CadastraFolhaActionForm() {
        super();
    }

    public BigDecimal getInss() {
        return inss;
    }

    public void setInss(BigDecimal inss) {
        this.inss = inss;
    }

    public BigDecimal getSindicato() {
        return sindicato;
    }

    public void setSindicato(BigDecimal sindicato) {
        this.sindicato = sindicato;
    }

    public BigDecimal getAjudacusto() {
        return ajudacusto;
    }

    public void setAjudacusto(BigDecimal ajudacusto) {
        this.ajudacusto = ajudacusto;
    }

    public BigDecimal getPlr() {
        return plr;
    }

    public void setPlr(BigDecimal plr) {
        this.plr = plr;
    }

    public BigDecimal getDecimo() {
        return decimo;
    }

    public void setDecimo(BigDecimal decimo) {
        this.decimo = decimo;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getFerias() {
        return ferias;
    }

    public void setFerias(String ferias) {
        this.ferias = ferias;
    }

    public String getDatapagamento() {
        return datapagamento;
    }

    public void setDatapagamento(String datapagamento) {
        this.datapagamento = datapagamento;
    }

    public String getSalariofamilia() {
        return salariofamilia;
    }

    public void setSalariofamilia(String salariofamilia) {
        this.salariofamilia = salariofamilia;
    }

    public List<Funcionario> getFuncionarios() {
        FuncionarioDAO dao = new FuncionarioDAO();
        this.funcionarios = dao.listarTodosFuncionarios();
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Empresa> getEmpresas() {
        EmpresaDAO dao = new EmpresaDAO();
        this.empresas = dao.listarTodosEmpresas();
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getFuncionarios() == null) {
            errors.add("funcionarios", new ActionMessage("error.funcionarios.required"));
        }
        if (getEmpresas() == null) {
            errors.add("empresas", new ActionMessage("error.empresa.required"));
        }
        return errors;
    }

}
