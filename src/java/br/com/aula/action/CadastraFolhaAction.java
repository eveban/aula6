package br.com.aula.action;

import br.com.aula.Empresa;
import br.com.aula.Folha;
import br.com.aula.Funcionario;
import br.com.aula.actionform.CadastraFolhaActionForm;
import br.com.aula.dao.EmpresaDAO;
import br.com.aula.dao.FolhaDAO;
import br.com.aula.dao.FuncionarioDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CadastraFolhaAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        CadastraFolhaActionForm formBean = (CadastraFolhaActionForm) form;
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.consultarFuncionarioPorId(formBean.getFuncionario());

        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = empresaDAO.consultarEmpresaPorId(formBean.getEmpresa());

        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
        String str = formBean.getDatapagamento();

        Date data = formata.parse(str);

        Folha folha = new Folha(
                empresa,
                funcionario,
                formBean.getInss(),
                formBean.getSindicato(),
                formBean.getAjudacusto(),
                formBean.getPlr(),
                formBean.getDecimo(),
                formBean.getPeriodo(),
                formBean.getFerias(),
                data,
                formBean.getSalariofamilia(),
                formBean.getSalario()
        );
        FolhaDAO folhaDAO = new FolhaDAO();
        folhaDAO.inserirFolha(folha);
        return mapping.findForward(SUCCESS);
    }
}
