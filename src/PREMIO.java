
//pao 1
//doce 2
//bolo 3
//bolo = maior 150
//doce = maior 120
//pao = maior 100

import java.sql.SQLOutput;
import java.util.Scanner;
public class PREMIO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int P = 1;
        int D = 2;
        int B = 3;

        int qtdeP = input.nextInt();
        int qtdeD = input.nextInt();
        int qtdeB = input.nextInt();

        int Total = qtdeP + (D*qtdeD) + (B*qtdeB);



        if(Total >= 150){
            System.out.println("B");
        }
        else if (Total >= 120) {
            System.out.println("D");
        }
        else if(Total >= 100){
            System.out.println("P");
        }
        else{
            System.out.println("N");
        }
    }

}
