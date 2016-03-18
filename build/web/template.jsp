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
        <link rel="stylesheet" type="text/css" media="all" href="css/estilo.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/menu.css">
        <script type="text/javascript" src="js/menu.js"></script>
        <script type="text/javascript" src="js/jquery.js"></script>
        <title>Formulário de cadastro de Funcionários</title>
    </head>

    <body>

        <div class="global-div">

            <div class="topo-div"></div>

            <div class="menu-div">
                <div id="menu">
                    <ul class="menu">
                        <li><a href="#" class="parent"><span>Home</span></a>
                            <ul>
                                <li><a href="#" class="parent"><span>Sub Item 1</span></a>
                                    <ul>
                                        <li><a href="#" class="parent"><span>Sub Item 1.1</span></a>
                                            <ul>
                                                <li><a href="#"><span>Sub Item 1.1.1</span></a></li>
                                                <li><a href="#"><span>Sub Item 1.1.2</span></a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#"><span>Sub Item 1.2</span></a></li>
                                        <li><a href="#"><span>Sub Item 1.3</span></a></li>
                                        <li><a href="#"><span>Sub Item 1.4</span></a></li>
                                        <li><a href="#"><span>Sub Item 1.5</span></a></li>
                                        <li><a href="#"><span>Sub Item 1.6</span></a></li>
                                        <li><a href="#" class="parent"><span>Sub Item 1.7</span></a>
                                            <ul>
                                                <li><a href="#"><span>Sub Item 1.7.1</span></a></li>
                                                <li><a href="#"><span>Sub Item 1.7.2</span></a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li><a href="#"><span>Sub Item 2</span></a></li>
                                <li><a href="#"><span>Sub Item 3</span></a></li>
                            </ul>
                        </li>
                        <li><a href="#" class="parent"><span>Product Info</span></a>
                            <ul>
                                <li><a href="#" class="parent"><span>Sub Item 1</span></a>
                                    <ul>
                                        <li><a href="#"><span>Sub Item 1.1</span></a></li>
                                        <li><a href="#"><span>Sub Item 1.2</span></a></li>
                                    </ul>
                                </li>
                                <li><a href="#" class="parent"><span>Sub Item 2</span></a>
                                    <ul>
                                        <li><a href="#"><span>Sub Item 2.1</span></a></li>
                                        <li><a href="#"><span>Sub Item 2.2</span></a></li>
                                    </ul>
                                </li>
                                <li><a href="#"><span>Sub Item 3</span></a></li>
                                <li><a href="#"><span>Sub Item 4</span></a></li>
                                <li><a href="#"><span>Sub Item 5</span></a></li>
                                <li><a href="#"><span>Sub Item 6</span></a></li>
                                <li><a href="#"><span>Sub Item 7</span></a></li>
                            </ul>
                        </li>
                        <li><a href="#"><span>Help</span></a></li>
                        <li class="last"><a href="#"><span>Contacts</span></a></li>
                    </ul>
                </div>
            </div>

            <div class="esq-div">

                <div class="destaques-div">
                    <h5>Destaques</h5>

                    <div class="foto-destaque"></div>
                    <h1>Montando layout com CSS</h1>
                    <p class="right17">Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Praesent rutrum malesuada urna. Aliquam sollicitudin. Pellentesque id nisi. Duis in mi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec ac elit. Etiam posuere venenatis ante. Nunc ullamcorper neque ac justo. Donec id purus. Aenean non enim.</p>
                    <a href="#" title="Leia mais" class="leiamais">leia mais</a>
                </div>

                <div class="chamadas-div">
                    <h4>Programação</h4> 
                    <h2>Artigo em destaque</h2> 
                    <p class="right17">Donec ac elit. Etiam posuere venenatis ante. Nun ullamcorper neque ac justo. Donec id alor purus. Aenean non enim eget diam aliquam tristique. Mauris pellentesque pulvinar dui. </p>            <a href="#" title="Leia mais" class="leiamais">leia mais</a>
                    <h6>Mais artigos</h6>
                    <ul class="maisartigos">
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                    </ul>      
                </div>

                <div class="chamadas-div left17">
                    <h4>Webdesign</h4>
                    <h2>Artigo em destaque</h2>
                    <p>Donec ac elit. Etiam posuere venenatis ante. Nun ullamcorper neque ac justo. Donec id alor purus. Aenean non enim eget diam aliquam tristique. Mauris pellentesque pulvinar dui. </p>   
                    <a href="#" title="Leia mais" class="leiamais">leia mais</a>
                    <h6>Mais artigos</h6>
                    <ul class="maisartigos">
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                    </ul>      

                </div>            

            </div>
            <div class="dir-div">

                <form action="#">
                    <fieldset>
                        <input type="text" name="termo" class="busca" value="Digite o termo e pressione enter" />
                    </fieldset>
                </form>

                <div class="maislidos-div">
                    <h4>Mais lidos</h4>
                    <ul class="maisartigos escuro top8">
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                        <li><a href="#" title="Donec ac elit">Donec ac elit</a></li>
                        <li><a href="#" title="Lorem impsum amet">Lorem impsum amet</a></li>
                    </ul>     
                </div>
                <div class="anuncios-div"></div> 
                <div class="anuncios-div left17"></div> 
                <div class="anuncios-div "></div> 
                <div class="anuncios-div left17"></div> 

            </div>

            <div class="rodape-div"><p>Everson & Leonardo</p></div>

        </div>
    </body>
</html>
