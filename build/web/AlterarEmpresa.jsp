
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
        <title>Formulário de alteração de Empresas</title>
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
                <h5>Alteração de Empresas</h5>

                <html:form action="alterarEmpresa2" method="POST">


                    <div class="col-2">
                        <label>
                            Nome:
                            <html:text  property="nome" name="AlteraEmpresaActionForm" tabindex="1"/>
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            Local:
                            <html:text name="AlteraEmpresaActionForm" property="cnpj" tabindex="2" />
                        </label>
                    </div>

                    <table border="0" style="width: 100%">

                        <tbody>
                            <tr>
                                <td style="text-align: right"><input type="submit" value="Alterar" class="login-submit-form"></td>
                            </tr>
                        </tbody>
                    </table>

                </html:form>
                <html:errors/>
            </div>
            <div style="text-align: center" class="rodape-div"><p>Leonardo & Everson</p></div>
        </div>
    </body>
</html>
