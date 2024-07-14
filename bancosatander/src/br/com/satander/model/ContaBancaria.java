package br.com.satander.model;

/**
 *  interface é um "contrato" quem o implementa tem que seguir é como se fosse uma planta de uma
 * contrução.
 */
interface ContaBancaria {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
