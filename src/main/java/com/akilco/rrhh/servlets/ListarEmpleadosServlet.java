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
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alvaro Mena
 */
public class ListarEmpleadosServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // aqui deberíamos traer los empleados desde la bd
       List<Empleado> empleados= new LinkedList<>();
       empleados.add(new Empleado(10, "Juan", "Mora", new Departamento(100, "Contabilidad")));
       empleados.add(new Empleado(11, "Danny", "Roque", new Departamento(100, "Informatica")));
      
       // Adiciona el objeto empleados en el contexto request
       req.setAttribute("empleados", empleados);
       // redirigir el flujo de ejecución hacia el JSP
       req.getRequestDispatcher("listar_empleados.jsp").forward(req, resp);
   }

  
}

