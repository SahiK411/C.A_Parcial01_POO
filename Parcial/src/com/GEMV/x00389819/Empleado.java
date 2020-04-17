package com.GEMV.x00389819;

public class Empleado {
    protected String nombre;
    protected String puesto;
    protected double salario;

    public Empleado(String nName, String nPost, double nSalary){
        nombre = nName;
        puesto = nPost;
        salario = (double) Math.round(nSalary * 100d) / 100d;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPuesto(){
        return puesto;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double nSalary){
        salario = nSalary;
    }
}
