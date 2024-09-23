package view;

import br.edu.fateczl.fila.Fila;
import controller.OperacaoController;
import model.Cliente;

import java.util.Random;

public class Principal {
    public static Fila<Cliente> filaClientes = new Fila<>();

    public static void main(String[] args) {
        Random rand = new Random();
        OperacaoController operacaoController = new OperacaoController();

        for (int i = 0; i < 20; i++) {
            int quantidade = rand.nextInt(50 - 20 + 1) + 20;
            float valor = (float) (rand.nextFloat((float) (100.00 - 5.00 + 1.00)) + 5.00);

            Cliente cliente = new Cliente("Cliente" + (i+1), quantidade, valor);
            filaClientes.insert(cliente);
        }
        try {
            operacaoController.caixa(filaClientes);
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
