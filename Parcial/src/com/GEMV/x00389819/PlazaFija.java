package com.GEMV.x00389819;

public class PlazaFija extends Empleado{
    private int extension;

    public PlazaFija(String nName, String nPost, double nSalary, int nExtension){
        super(nName, nPost, nSalary);
        extension = nExtension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
