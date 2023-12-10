package controller;

public class Facturalgv extends Factura{

    @Override
    public double getImporteIgv() {
        return getImporte()*1.18;
    }
}
