package Exercicio3;
public class Conta {
    private double saldo;
    private double limite;
    public void depositar(double valor) {
        saldo += valor;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void saca(double valor) throws ContaExcecao {
        if (valor > saldo + limite) {
            throw new ContaExcecao ("Operação não realizada pois saldo é insuficiente para saque", saldo);
        }
        saldo -= valor;
    }
}
