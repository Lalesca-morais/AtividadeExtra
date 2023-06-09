package Exercicio4;
public class Conta {
public static void main(String[] args) {
    Conta minhaConta = new Conta();
    minhaConta.depositar(10);
    minhaConta.setLimite(100);
    try {
        minhaConta.saca(100);
        System.out.println("Saque realizado com sucesso.");
        } catch (ContaExcecao e) {
        System.out.println("Mensagem de erro: " + e.getMessage());
    }
  }
}