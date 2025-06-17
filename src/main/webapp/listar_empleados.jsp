<%@page import=" com.akilco.rrhh.domain.Empleado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Listar empleados</title>
   </head>
   <body>
       <h1>Listar empleados</h1>
       <%-- Scriptlets y expresiones, JSTL--%>
       <%-- Recuperar el objeto empleados que se encuentra en el contexto request --%>
       <% List<Empleado> empleados = (List<Empleado>) request.getAttribute("empleados");  %>

       <% for (int i=0; i<6; i++ ){ %>
            <b> <%=  i %> </b>
            
       <% } %>
       
       
       <% for (Empleado empleadoActual : empleados) { %>
       <%-- EXPRESION es similar a un System.out.print --%>
           <%= empleadoActual.getApellidos() %> <br>
       <% } %>
      
       <table>
        <tr>
          <th>No. empleado</th>
          <th>Nombre de empleado</th>
          <th>Departamento</th>
        </tr>
        <% for(Empleado empleado:empleados){ %>
        <tr>
            <td>
                <a href="/ver_empleado.jsp?idEmpleado=<%= empleado.getIdEmpleado() %>&nombre=<%= empleado.getNombre() + " "+ empleado.getApellidos() %>" >
           <%= empleado.getIdEmpleado() %> 
        </a>
            </td>
          <td><%= empleado.getNombre() + " " + empleado.getApellidos() %></td>
          <td><%= empleado.getDepartamento().getNombreDepartamento() %></td>
        </tr>
        <% } %>
        
        
      </table>
   </body>
</html>
