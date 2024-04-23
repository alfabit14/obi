import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Chinelos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de tamanhos (N)");
        int N = input.nextInt();

        ArrayList<Integer>estoque = new ArrayList<>();
        for (int I = 0; I < N; I ++){
            System.out.println("Digite o tamanho");
            estoque.add(input.nextInt());

        }

        for (int I = 0; I < estoque.size(); I ++){
            System.out.println(estoque.get(I));
        }

        System.out.println("Digite a quantidade de pedios");
        int P = input.nextInt();
        int vendas = 0;

        for (int I = 0;I < P; I ++){
            System.out.println("digite a quantidade de chinelos");
            int quantidade = input.nextInt();

            if (estoque.get(quantidade - 1) >= I){
                int controle_estoque = estoque.get(quantidade - 1);
                estoque.set(P - 1, controle_estoque - 1);
                vendas += 1;
            }
        }
        System.out.println(vendas);



















































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

        for (int I2 = 0; I2 < P2; I2++ ){
            System.out.println("qual a quantidade de chinelos?");
            int quantidade2 = input.nextInt();
            if (estoque1[I2] > quantidade2){
                estoque1[I2] -=  quantidade2;
                vendas2 += 1;


            }

        }
        System.out.println(vendas2);



    }
}
