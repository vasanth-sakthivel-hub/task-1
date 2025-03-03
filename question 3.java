import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);


        int i = 876;

         while (i > 0){
             System.out.print(i % 10);
             i = i / 10;
         }

    }
}