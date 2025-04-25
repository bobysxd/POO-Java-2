package model;

public interface Pedido {
    void adicionarPizza(Pizza pizza);
    void listarPedido();
    double calcularTotal();
}
