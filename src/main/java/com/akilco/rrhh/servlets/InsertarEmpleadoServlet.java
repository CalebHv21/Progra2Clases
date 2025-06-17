/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.akilco.rrhh.servlets;

import com.akilco.rrhh.domain.Departamento;
import com.akilco.rrhh.domain.Empleado;
import java.io.IOException;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alvaro Mena
 */
public class InsertarEmpleadoServlet extends HttpServlet {
    private List<Departamento> departamentos;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.departamentos = new ArrayList<>();
        this.departamentos.add(new Departamento(100, "Finazas"));
        this.departamentos.add(new Departamento(120, "TI"));
        req.setAttribute("departamentos", this.departamentos);
        req.getRequestDispatcher("/insertar_empleado.jsp").forward(req, resp);
    }
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         Empleado empleado = new Empleado();
        empleado.setNombre(req.getParameter("nombreEmpleado"));
        empleado.setApellidos(req.getParameter("apellidosEmpleado"));
        empleado.getDepartamento().setCodDepartamento(Integer.parseInt(
                req.getParameter("codDepto")));
        
        // deberiamos enviar el empleado para insertar a la b.d.
        
        req.getRequestDispatcher("/ver_empleado.jsp?idEmpleado="+empleado.getIdEmpleado() +
                "&nombre="+empleado.getNombre() + " " + empleado.getApellidos()).forward(req, resp);
    }
   
}
