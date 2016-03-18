<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>Linguagem de Programação II</title>
        <link rel="stylesheet" href="css/styleLogin.css">
    </head>
    <body>
        <section class="about">
            <p class="about-author">Everson Silva - 201500726 <br /> Leonardo <br /> Escola de Engenharia de Piracicaba <br /> Linguagem de Programação II <br /> Prof. Martins</p>
            <div style="color: red;"> <html:errors /> </div>
        </section>
        <html:form action="/login" styleClass="login">
            <p>
                <label for="login">Usuário:</label> 
                <html:text property="login" name="LoginActionForm" />
            </p>      

            <p>
                <label for="password">Senha:</label>
                <html:password property="senha" name="LoginActionForm"/>
            </p>

            <p class="login-submit">
                <button type="submit" class="login-button">Login</button>
            </p>
            <html:messages id="message" property="<%=org.apache.struts.action.ActionMessages.GLOBAL_MESSAGE%>">
            <li><bean:write name="message"/></li>
            </html:messages>
        </html:form>

</body>
</html>