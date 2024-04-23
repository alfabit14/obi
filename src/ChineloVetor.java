import java.util.Scanner;

public class ChineloVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o numero de tamanhos (N)");
        int N1 = input.nextInt();

        int estoque1[] = new int[N1];
        for (int I2 = 0; I2 < N1; I2 ++){
            System.out.println("Digite o tamanho");
            estoque1[I2] = input.nextInt();
        }

        for (int I2 = 0; I2 < estoque1.length; I2 ++){
            System.out.println(estoque1[I2]);
        }
        System.out.println("digite o numero de pedidos");

        int P2 = input.nextInt();
        int vendas2 = 0;

        for (int tamanho : estoque1) {
            System.out.println("qual a quantidade de chinelos?");
            int quantidade2 = input.nextInt();
            if (tamanho >= quantidade2) {
                tamanho -= quantidade2;
                vendas2 += 1;
            }


        }
        System.out.println(vendas2);











































    }





















}
