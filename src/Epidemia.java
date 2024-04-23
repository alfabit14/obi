import java.util.Scanner;
public class Epidemia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int R = input.nextInt();
        int P = input.nextInt();
        int dia = 0;

        while(N < P){
            N = N +(N * R);
            dia = dia + 1;
        }
        System.out.println(dia);
        System.out.println(N);
        System.out.println(P);






    }
}