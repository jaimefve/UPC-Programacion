package controller;

public class FacturaIgvDcto extends Factura{
    @Override
    public double getImporteIgv() {
        return getImporte()*1.18-0.20;
    }
}