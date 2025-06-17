<%-- 
    Document   : ver_empleado
    Created on : Jun 12, 2025, 10:57:14 AM
    Author     : Alvaro Mena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información del empleado</title>
    </head>
    <body>
        <h1>Información del empleado</h1>
        <% int identificacion = Integer.parseInt(request.getParameter("idEmpleado"));
            String nombre = request.getParameter("nombre");
            %>
        
        Identificación: <%= identificacion %>
        Nombre: <%= nombre %>
    </body>
</html>
