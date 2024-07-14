package br.com.satander.model;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, Cliente titular, double taxaRendimento) {
        super(numeroConta, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }
    
}
