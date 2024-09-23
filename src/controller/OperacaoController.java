package controller;

import br.edu.fateczl.fila.Fila;
import model.Cliente;

public class OperacaoController {
    public void caixa(Fila<Cliente> fila) throws Exception {
        while (!fila.isEmpty()) {
            Cliente cliente = fila.remove();
            int valor = (int) (cliente.QuantidadePecas * cliente.ValorPecas);
            System.out.println(cliente.nome + " | " + "R$ " + valor);
        }
    }
}
