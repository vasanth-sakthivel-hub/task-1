import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            int k = 5;
            for (int j = 0; j < 5; j++) {
                System.out.print(k + " ");
                if (j < i) {
                    k--;
                }
            }
            System.out.println();
        }
    }
}



