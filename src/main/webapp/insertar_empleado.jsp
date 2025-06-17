<%-- 
    Document   : insertar_empleado.jsp
    Created on : Jun 12, 2025, 11:21:54 AM
    Author     : Alvaro Mena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.akilco.rrhh.domain.Departamento"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar empleado</title>
    </head>
    <body>
        <h1>Insertar empleado</h1>
        <form action="/insertarEmpleado" method="post">
            <div>
                <label for="nombreEmpleado">Nombre del empleado:</label>
                <input id="nombreEmpleado" name="nombreEmpleado" type="text" required>
            </div>
             <div>
                <label for="apellidosEmpleado">Apellidos del empleado:</label>
                <input id="apellidosEmpleado" name="apellidosEmpleado" type="text" required>
            </div>
            
            <% 
                List<Departamento> departamentos = (List<Departamento>) request.getAttribute("departamentos");
            %>
            <div>
            <label for="codDepto">Seleccione un departamento:</label>
            <select id="codDepto" name="codDepto">
                 <% for(Departamento depto:departamentos) { %>
                <option value="<%= depto.getCodDepartamento() %>"> 
                    <%= depto.getNombreDepartamento() %>
                </option>
                <% } %>
            </select>
            </div>
            
            <div>
                <input name="btnSalvar" type="submit" value="Salvar">
            </div>
        </form>
    </body>
</html>












