
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            table.table-style-three {
                font-family: verdana, arial, sans-serif;
                font-size: 11px;
                color: #333333;
                border-width: 1px;
                border-color: #99B2B7;
                border-collapse: collapse;
            }
            table.table-style-three th {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #99B2B7;
                background-color: #005F6B;
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
                border-color:#99B2B7;
                background-color: #ffffff;
            }
        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de funcionários</title>
    </head>
    <body>
        <h1>Lista de funcionários</h1>
        <logic:present name="ListarFuncionariosActionForm" property="funcionarios">
            <table  class="table-style-three">
                <thead>
                    <tr>
                        <th>ID:</th>
                        <th>Nome:</th>
                        <th>Função:</th>
                        <th>Registro:</th>
                        <th>Departamento:</th>
                        <th>Alterar?</th>
                        <th>Remover?</th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="ListarFuncionariosActionForm" property="funcionarios" id="funcionario">
                        <tr>
                            <td><bean:write name="funcionario" property="id"/></td>
                            <td><bean:write name="funcionario" property="nome"/></td>
                            <td><bean:write name="funcionario" property="funcao"/></td>
                            <td><bean:write name="funcionario" property="registro"/></td>
                            <td><bean:write name="funcionario" property="departamento.id"/></td>
                            <td><a href="alterarProduto1.do?id=<bean:write name="funcionario" property="id"/>">Alterar</a></td>
                            <td><a href="removerProduto.do?id=<bean:write name="funcionario" property="id"/>">Remover</a></td>
                        </tr>                        
                    </logic:iterate>
                </tbody>
            </table>
        </logic:present>
        <html:link href="insereFuncionarioForm.jsp">Inserir novo</html:link>
    </body>
</html>
