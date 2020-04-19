package com.GEMV.x00389819;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String tName, tPost;
        double tSalary;
        int tVar;

        JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());
        tName = "William";
        tPost = "Supervisor de Ventas";
        tSalary = 569.00d;
        tVar = 78985527;

        PlazaFija empleado = new PlazaFija(tName, tPost, tSalary, tVar);
        try{
            if(empleado.getExtension() < 10000000){
                JOptionPane.showMessageDialog(null, "Empleado: " + empleado.getNombre() + "\n" +
                        "Puesto: " + empleado.getPuesto() + "\n" +
                        "Numero de Oficina: " + "No Aplicable" + "\n" +
                        "Salario antes de Impuestos: " + empleado.getSalario() + "\n" +
                        "Salario: " + CalculadoraImpuestos.calcularPago(empleado));
            }
            else{
                JOptionPane.showMessageDialog(null, "Empleado: " + empleado.getNombre() + "\n" +
                        "Puesto: " + empleado.getPuesto() + "\n" +
                        "Numero de Oficina: " + empleado.getExtension() + "\n" +
                        "Salario antes de Impuestos: " + empleado.getSalario() + "\n" +
                        "Salario: " + CalculadoraImpuestos.calcularPago(empleado));
            }
        }
        catch (Exception e){
            if(e instanceof IllegalArgumentException){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            else{
                JOptionPane.showMessageDialog(null, "Se produjo un error!");
            }
        }
        JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());

        tName = "Bill";
        tPost = "Vendedor";
        tSalary = 420.00d;
        tVar = 4;

        ServicioProfesional contratador = new ServicioProfesional(tName, tPost, tSalary, tVar);
        if(contratador.getMeses() <= 0){
            contratador.setMeses(1);
        }
        try{
            JOptionPane.showMessageDialog(null, "Contratador: " + contratador.getNombre() + "\n" +
                    "Puesto: " + contratador.getPuesto() + "\n" +
                    "Meses de Contrato: " + contratador.getMeses() + "\n" +
                    "Salario antes de Impuestos: " + contratador.getSalario() + "\n" +
                    "Salario: " + CalculadoraImpuestos.calcularPago(contratador));
        }
        catch (Exception e){
            if(e instanceof IllegalArgumentException){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            else{
                JOptionPane.showMessageDialog(null, "Se produjo un error!");
            }
        }
        JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());
    }

}
