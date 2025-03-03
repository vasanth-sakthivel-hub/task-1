import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);

        int[] arr = {2, 5,9};


        System.out.println(findSmallest (arr));
    }

        public static int findSmallest( int[] arr){
            int smallest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (smallest > arr[i]) {
                    smallest = arr[i];
                }

            }
            return smallest;

        }


    }








