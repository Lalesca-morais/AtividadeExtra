package Exercicio1;
public class TesteException {
    public static void main(String[] args) {
        try {
            System.out.println("Inicio do main");
            metodo1();
            System.out.println("Fim do main");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    static void metodo1 () {
        System.out.println("Inicio do metodo1 ");
        metodo2();
        System.out.println("Fim do metodo2");
    }
    static void metodo2 () {
        System.out.println("Incio do metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println("Fim do metodo2");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


