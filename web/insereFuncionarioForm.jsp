<%-- 
    Document   : insereFuncionarioForm
    Created on : 17/09/2015, 21:53:02
    Author     : aluno
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/switchery.min.css">
        <script type="text/javascript" src="js/switchery.min.js"></script>
        <title>Formulário de cadastro de Funcionários</title>
    </head>
    <body>
        <h1>Cadastro de funcionários</h1>

        <html:form action="/inserirFuncionario" method="POST">

            <div class="col-2">
                <label>
                    Nome
                    <html:text  property="nome" name="InsereFuncionarioActionForm" tabindex="1"/>
                </label>
            </div>
            <div class="col-2">
                <label>
                    Função
                    <html:text name="InsereFuncionarioActionForm" property="funcao" tabindex="2" />
                </label>
            </div>
            <div class="col-3">
                <label>
                    Registro
                    <html:text name="InsereFuncionarioActionForm" property="registro" tabindex="3" />
                </label>
            </div>

            <div class="col-3">
                <label>
                    Departamento

                    <html:select name="InsereFuncionarioActionForm" property="departamento">
                        <html:option value="0">--Select Departamento--</html:option>
                        <html:optionsCollection name="InsereFuncionarioActionForm" property="departamentos" label="nome" value="id"/>
                    </html:select>
                </label>
            </div>


        <td colspan="2"><html:submit value="Cadastrar"/></td>

    </html:form>
    <html:errors/>
</body>
</html>
