<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/menu.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/estilo.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/switchery.min.css">
        <script type="text/javascript" src="js/switchery.min.js"></script>


        <title>Formulário Alteração de Folha</title>
    </head>
    <body>
        <div class="global-div">
            <div class="topo-div">
                <br />
                <div style="font-size: 30px; 
                     text-align: center; 
                     margin-top: 0px; 
                     color: #ffffff">
                    Escola de Engenharia de Piracicaba<br />
                    Linguagem de Programação II<br /> 

                    <h1 style="font-size: 18px; margin-top: 0px">

                        Alunos: <br />
                        Everson Silva - 201500726 <br />
                        Leonardo G. Nascimento - 200901277 
                        <h1/> 
                </div>
            </div>

            <div class="menu-div">
                <div id="menu">
                    <ul class="menu">
                        <li><a href="#" class="parent"><span>Cadastos</span></a>
                            <ul>
                                <li><a href="#" class="parent"><span>Funcionários</span></a> 
                                    <ul>
                                        <li><a href="CadastraFuncionario.jsp"><span>Incluir Funcionários</span></a></li>
                                        <li><a href="listarFuncionarios.do"><span>Listar Funcionarios</span></a></li>
                                    </ul>
                                </li>
                                <li><a href="#"><span>Departamento</span></a>
                                    <ul>
                                        <li><a href="CadastraDepartamento.jsp"><span>Incluir Departamento</span></a></li>
                                        <li><a href="listarDepartamentos.do"><span>Listar Departamentos</span></a></li>
                                    </ul>
                                </li>
                                <li><a href="#"><span>Dependentes</span></a>

                                    <ul>
                                        <li><a href="CadastraDependente.jsp"><span>Incluir Dependentes</span></a></li>
                                        <li><a href="listarDependentes.do"><span>Listar Dependentes</span></a></li>
                                    </ul></li>
                                <li><a href="#"><span>Empresas</span></a>

                                    <ul>
                                        <li><a href="CadastraEmpresa.jsp"><span>Incluir Empresas</span></a></li>
                                        <li><a href="listarEmpresas.do"><span>Listar Empresas</span></a></li>
                                    </ul></li>
                            </ul>
                        </li>
                        <li><a href="#" class="parent"><span>Folha de Pagamento</span></a>
                            <ul>
                                <li><a href="#" class="parent"><span>RH</span></a>
                                    <ul>
                                        <li><a href="CadastraFolha.jsp"><span>Lançar Folhas</span></a></li>
                                        <li><a href="listarFolhas.do"><span>Listar Folhas</span></a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="destaques-div">
                <h5>Alteração Folha de Pagamento</h5>

                <html:form action="alterarFolha2" method="POST">

                    <div class="col-2">
                        <label>
                            Funcionário: 
                            <html:select name="AlterarFolhaActionForm" property="funcionario">
                                <html:option value="0">--Select Funcionario--</html:option>
                                <html:optionsCollection name="AlterarFolhaActionForm" property="funcionarios" label="nome" value="id"/>
                            </html:select>
                        </label>
                    </div>

                    <div class="col-2">
                        <label>
                            Empresas: 

                            <html:select name="AlterarFolhaActionForm" property="empresa">
                                <html:option value="0">--Select Empresa--</html:option>
                                <html:optionsCollection name="AlterarFolhaActionForm" property="empresas" label="nome" value="id"/>
                            </html:select>
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            Data Pagamento:
                            <html:text   property="datapagamento" name="AlterarFolhaActionForm" tabindex="1" />
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            Salário:
                            <html:text  property="salario" name="AlterarFolhaActionForm" tabindex="1"/>
                        </label>
                    </div>

                    <div class="col-2">
                        <label>
                            INSS:
                            <html:text  property="inss" name="AlterarFolhaActionForm" tabindex="1"/>
                        </label>
                    </div>

                    <div class="col-2">
                        <label>
                            Sindicato:
                            <html:text name="AlterarFolhaActionForm" property="sindicato" tabindex="2" />
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            Ajuda de Custo
                            <html:text name="AlterarFolhaActionForm" property="ajudacusto" tabindex="3" />
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            PLR 1/12: 
                            <html:text name="AlterarFolhaActionForm" property="plr" tabindex="4" />
                        </label>
                    </div>

                    <div class="col-2">
                        <label>
                            Decimo 1/12:
                            <html:text name="AlterarFolhaActionForm" property="decimo" tabindex="5" />
                        </label>
                    </div>

                    <div class="col-2">
                        <label>
                            Periodo:
                            <html:text name="AlterarFolhaActionForm" property="periodo" tabindex="6" />
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            Férias 1/12:
                            <html:text name="AlterarFolhaActionForm" property="ferias" tabindex="6" />
                        </label>
                    </div>

                    <div class="col-2">
                        <label>
                            Salário Familia? 
                            <html:select name="AlterarFolhaActionForm" property="salariofamilia">
                                <html:option value="0">--Selecione--</html:option>
                                <html:option value="Sim">Sim</html:option>
                                <html:option value="Não">Não</html:option>
                            </html:select>
                        </label>
                    </div>


                    <table border="0" style="width: 100%">

                        <tbody>
                            <tr>
                                <td><input type="submit" value="Salvar" class="login-submit-form"></td>
                            </tr>
                        </tbody>
                    </table>


                </html:form>
                <html:errors/>
            </div>
            <div class="rodape-div"><p>Everson & Leonardo</p></div>
        </div>
    </body>
</html>
