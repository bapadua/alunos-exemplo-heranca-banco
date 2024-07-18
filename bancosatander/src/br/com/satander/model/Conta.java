package br.com.satander.model;

public abstract class Conta implements ContaBancaria {
    //protected somente as classes do mesmo pacote podem enxergar, ou seja, na mesma pasta
    protected double saldo;
    protected String numeroConta;
    protected Cliente titular;

    /**
     * metodo construtor, você pode especificar os parametros assim a classe já inicia preenchida.
     * @param numeroConta 
     * @param titular
     */
    public Conta(String numeroConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        //quando você criar a classe, por padrão o saldo é 0.0
        this.saldo = 0.0;
    }


    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        /**
         * se o saldo atual for maior ou igual valor do saque 
         * reduz o valor do saldo
         * se não mensagem de saldo insuficiente.
         * */
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }        
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

}
