/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.akilco.rrhh.domain;

/**
 *
 * @author Alvaro Mena
 */
public class Departamento {
    private int codDepartamento;
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(int codDepartamento, String nombreDepartamento) {
        this.codDepartamento = codDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
}
