package com.GEMV.x00389819;

public class Main {

    public static void main(String[] args) {
        String tName, tPost;
        double tSalary;
        int tVar;

        try{
            System.out.println(CalculadoraImpuestos.mostrarTotales());
            tName = "William";
            tPost = "Supervisor de Ventas";
            tSalary = 579.00d;
            tVar = 78985527;

            PlazaFija empleado = new PlazaFija(tName, tPost, tSalary, tVar);
            System.out.println("Empleado: " + empleado.getNombre() + "\n" +
                    "Puesto: " + empleado.getPuesto() + "\n" +
                    "Numero de Oficina: " + empleado.getExtension() + "\n" +
                    "Salario antes de Impuestos: " + empleado.getSalario() + "\n" +
                    "Salario: " + CalculadoraImpuestos.calcularPago(empleado));
            System.out.println(CalculadoraImpuestos.mostrarTotales());

            tName = "Bill";
            tPost = "Vendedor";
            tSalary = 420.00d;
            tVar = 4;

            ServicioProfesional contratador = new ServicioProfesional(tName, tPost, tSalary, tVar);
            System.out.println("Empleado: " + contratador.getNombre() + "\n" +
                    "Puesto: " + contratador.getPuesto() + "\n" +
                    "Meses de Contrato: " + contratador.getMeses() + "\n" +
                    "Salario antes de Impuestos: " + contratador.getSalario() + "\n" +
                    "Salario: " + CalculadoraImpuestos.calcularPago(contratador));
            System.out.println(CalculadoraImpuestos.mostrarTotales());
        }
        catch (Exception e){
            if(e instanceof IllegalArgumentException){
                System.out.println(e.getMessage());
            }
            else{
                System.out.println("Se produjo un error!");
            }
        }
    }

}
