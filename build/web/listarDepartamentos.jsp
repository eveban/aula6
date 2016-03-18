<%-- 
    Document   : insereFuncionarioForm
    Created on : 17/09/2015, 21:53:02
    Author     : aluno
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head> <style type="text/css">
            table.table-style-three {
                font-family: verdana, arial, sans-serif;
                font-size: 11px;
                color: #333333;
                border-width: 1px;
                border-color:#6a6a6a;
                border-collapse: collapse;
                width: 100%;
            }
            table.table-style-three th {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #6a6a6a;
                background-color: #383435;
                color: #ffffff;

            }
            table.table-style-three tr:hover td {
                cursor: pointer;
            }
            table.table-style-three tr:nth-child(even) td{
                background-color: #e4e4e4;
            }
            table.table-style-three td {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color:#6a6a6a;
                background-color: #ffffff;
            }
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="stylesheet" type="text/css" media="all" href="css/estilo.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/menu.css">
        <script type="text/javascript" src="js/menu.js"></script>
        <script type="text/javascript" src="js/jquery.js"></script>
        <title>Listagem de Departamentos</title>
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
                <h5>Listagem de Departamentos - <a href="CadastraDepartamento.jsp">
                        <img src="images/adicionar.png" alt="Adicionar" style="width:24px;height:24px;border:0;">
                    </a></h5>                
                    <logic:present name="ListarDepartamentosActionForm" property="departamentos">
                    <table  class="table-style-three" style="text-align: center" >
                        <thead>
                            <tr>
                                <th>ID:</th>
                                <th>Nome:</th>
                                <th>Local:</th>
                                <th>Descriçao:</th>
                                <th>Alterar?</th>
                                <th>Remover?</th>
                            </tr>
                        </thead>
                        <tbody>
                            <logic:iterate name="ListarDepartamentosActionForm" property="departamentos" id="departamento">
                                <tr>
                                    <td><bean:write name="departamento" property="id"/></td>
                                    <td><bean:write name="departamento" property="nome"/></td>
                                    <td><bean:write name="departamento" property="local"/></td>
                                    <td><bean:write name="departamento" property="descricao"/></td>

                                    <td><a href="alterarDepartamento1.do?id=<bean:write name="departamento" property="id"/>">Alterar</a></td>
                                    <td><a href="removerDepartamento.do?id=<bean:write name="departamento" property="id"/>">Remover</a></td>
                                </tr>                        
                            </logic:iterate>
                        </tbody>
                    </table>
                </logic:present>
            </div>


            <div class="rodape-div"><p>Everson & Leonardo</p></div>

        </div>
    </body>
</html>
