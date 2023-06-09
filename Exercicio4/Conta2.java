package Exercicio4;

public class Conta2 {
    private double saldo;
    private double limite;
    public void depositar(double valor) {
        saldo += valor;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void saca(double valor) throws ContaExcecao {
        if (valor > saldo ) {
            throw new ContaExcecao("Saldo insuficiente para saque", saldo);
        }
        saldo -= valor;
    }
}