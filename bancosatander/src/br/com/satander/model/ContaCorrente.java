package br.com.satander.model;

public class ContaCorrente extends Conta {

    /**
     * possui tudo da classe pai + o limite
     */

    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, Cliente titular, double limiteChequeEspecial) {
        super(numeroConta, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    /**
     * aqui a gente sobrescreve(OVERRIDE) porque o comportamento da classe é diferente 
     */
    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente, incluindo cheque especial!");
        }
    }

}
