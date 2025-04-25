import model.*;

public class Main {
    public static void main(String[] args) {
        try {
            Pedido pedido = new PedidoSimples();

            Pizza pizza1 = new PizzaDeFrangoComCatupiry();
            Pizza pizza2 = new PizzaAcreanaDeBotas();

            pizza1.preparar();
            pedido.adicionarPizza(pizza1);

            pizza2.preparar();
            pedido.adicionarPizza(pizza2);

            pedido.listarPedido();

            double total = pedido.calcularTotal();
            System.out.println("Total do pedido: R$" + total);

        } catch (Exception e) {
            System.out.println("Erro ao processar pedido: " + e.getMessage());
        }
    }
}
