package model;

public class PizzaAcreanaDeBotas extends Pizza {
    public PizzaAcreanaDeBotas() {
        super("Pizza Acreana de Botas", 58.90);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza acreana de botas com bastante banana frita, leite condensado e queijo.");
    }
}
