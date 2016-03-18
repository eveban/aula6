
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
        <title>Altera��o de Funcion�rios</title>
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
                    Linguagem de Programa��o II<br /> 

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
                                <li><a href="#" class="parent"><span>Funcion�rios</span></a> 
                                    <ul>
                                        <li><a href="CadastraFuncionario.jsp"><span>Incluir Funcion�rios</span></a></li>
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
                                        <li><a href="CadastraFolha.jsp"><span>Lan�ar Folhas</span></a></li>
                                        <li><a href="listarFolhas.do"><span>Listar Folhas</span></a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="destaques-div">
                <h5>Altera��o de Funcion�rios</h5>

                <html:form action="alterarFuncionario2" method="POST">

                    <div class="col-2">
                        <label>
                            Nome
                            <html:text  property="nome" name="AlterarFuncionarioActionForm" tabindex="1"/>
                        </label>
                    </div>
                    <div class="col-2">
                        <label>
                            Fun��o
                            <html:text name="AlterarFuncionarioActionForm" property="funcao" tabindex="2" />
                        </label>
                    </div>
                    <div class="col-3">
                        <label>
                            Registro
                            <html:text name="AlterarFuncionarioActionForm" property="registro" tabindex="3" />
                        </label>
                    </div>

                    <div class="col-3">
                        <label>
                            CPF: 
                            <html:text name="AlterarFuncionarioActionForm" property="cpf" tabindex="4" />
                        </label>
                    </div>

                    <div class="col-3">
                        <label>
                            Pai:
                            <html:text name="AlterarFuncionarioActionForm" property="pai" tabindex="5" />
                        </label>
                    </div>

                    <div class="col-3">
                        <label>
                            M�e:
                            <html:text name="AlterarFuncionarioActionForm" property="mae" tabindex="6" />
                        </label>
                    </div>

                    <div class="col-3">
                        <label>
                            Departamento

                            <html:select name="AlterarFuncionarioActionForm" property="departamento">
                                <html:option value="0">--Select Departamento--</html:option>
                                <html:optionsCollection name="AlterarFuncionarioActionForm" property="departamentos" label="nome" value="id"/>
                            </html:select>
                        </label>
                    </div>
                    <div class="col-3">
                        <label>
                            Fumante: 
                            <html:select name="AlterarFuncionarioActionForm" property="fumante">
                                <html:option value="0">--Selecione--</html:option>
                                <html:option value="Sim">Sim</html:option>
                                <html:option value="N�o">N�o</html:option>
                            </html:select>
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
            <div class="rodape-div"><p>Everson & Leonardo</p></div>
        </div>
    </body>
</html>
