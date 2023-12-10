package controller;

public class FactoriaFacturas {
    public static Factura getFactura(String tipo) {
        if (tipo.equals("igv")) {
            return new Facturalgv();
        } else {
            return new FacturaIgvDcto();
        }
    }
}
