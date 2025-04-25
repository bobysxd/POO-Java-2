package model;

public class PizzaDeFrangoComCatupiry extends Pizza {
    public PizzaDeFrangoComCatupiry() {
        super("Pizza de Frango com Catupiry", 42.90);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de frango com catupiry com muito frango desfiado, catupiry e queijo.");
    }
}
