package model;

import java.util.ArrayList;
import java.util.List;

public class PedidoSimples implements Pedido {
    private List<Pizza> pizzas;

    public PedidoSimples() {
        pizzas = new ArrayList<>();
    }

    @Override
    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        System.out.println("Pizza adicionada: " + pizza.getNome());
    }

    @Override
    public void listarPedido() {
        System.out.println("Pizzas no pedido:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome() + " | R$" + pizza.getPreco());
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}
