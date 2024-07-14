package br.com.satander;

import br.com.satander.model.Cliente;
import br.com.satander.model.ContaCorrente;
import br.com.satander.model.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        ContaCorrente cc = new ContaCorrente("0001", cliente1, 500.0);
        ContaPoupanca cp = new ContaPoupanca("0002", cliente1, 0.05);

        cc.depositar(1000.0);
        cc.sacar(1200.0);
        cp.depositar(2000.0);
        cp.aplicarRendimento();

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
