<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link
            rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Jocs</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cerca un joc</h1>
                  <!--  <p>Afegir medicament</p> -->
                </div>
            </div>
        </section>
        <section class="container">
            <form:form modelAttribute="findJoc" class="form-horizontal">  <!--   -->
                <fieldset>
                    <legend>Cerca joc:</legend>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-2" for="name">Nom:</label>
                        <div class="col-lg-10">
                            <form:input id="name" path="name" type="text" class="form:input-large"/> <!--path=DOLAR{joc.name} -->
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </section>
    </body>
</html>