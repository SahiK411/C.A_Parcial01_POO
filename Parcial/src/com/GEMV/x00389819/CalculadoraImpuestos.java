package com.GEMV.x00389819;

public class CalculadoraImpuestos{
    //Attributes
    private static double totalRenta = 0;
    private static double totalISSS = 0;
    private static double totalAFP = 0;

    //Methods
    private CalculadoraImpuestos(){ }

    public static double calcularPago(Empleado check) throws IllegalArgumentException {
        if(check.salario <= 0){
            throw new IllegalArgumentException("El salario no puede ser negativo!");
        }

        double pago;
        if(check instanceof ServicioProfesional){
            double Renta = (0.1 * check.salario);
            Renta = (double) Math.round(Renta * 100d) / 100d; //Para mantener 2 decimales
            totalRenta += Renta;
            pago = check.salario - Renta;
            pago = (double) Math.round(pago * 100d) / 100d;
            return pago;
        }
        else if(check instanceof PlazaFija){
            double AFP = 0.0625d * check.salario;
            AFP = (double) Math.round(AFP * 100d) / 100d;
            totalAFP += AFP;

            double ISSS = 0.03d * check.salario;
            ISSS = (double) Math.round(ISSS * 100d) / 100d;
            totalISSS += ISSS;

            double Restante = check.salario - AFP - ISSS;
            double Renta;
            if(Restante >= 0.01d && Restante <= 472.00d){
                Renta = 0d;
            }
            else if(Restante <= 895.24d){
                Renta = 0.1d * (Restante - 472d) + 17.67d;
            }
            else if(Restante <= 2038.10){
                Renta = 0.2d * (Restante - 895.24d) + 60;
            }
            else{
                Renta = 0.3d * (Restante - 2038.10d) + 288.57d;
            }
            Renta = (double) Math.round(Renta * 100d) / 100d;
            totalRenta += Renta;

            pago = Restante - Renta;
            pago = (double) Math.round(pago * 100d) / 100d;
            return pago;
        }
        else{
            throw new IllegalArgumentException("Error de Clase!");
        }
    }

    public static String mostrarTotales(){
        return "Totales: \n" + "Renta: " + totalRenta + "\n" +
                "ISSS: " + totalISSS + "\n" +
                "AFP: " + totalAFP + "\n";
    }
}
