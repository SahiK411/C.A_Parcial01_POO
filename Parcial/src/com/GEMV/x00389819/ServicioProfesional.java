package com.GEMV.x00389819;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nName, String nPost, double nSalary, int nMonths){
        super(nName, nPost, nSalary);
        mesesContrato = nMonths;
    }

    public int getMeses() {
        return mesesContrato;
    }

    public void setMeses(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
