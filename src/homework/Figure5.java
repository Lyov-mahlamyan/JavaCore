package homework;

public class Figure5 {
    public static void main(String[] args) {
         for (int i = 0; i <= 4; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = 9; k > i; k--)
                System.out.print("* ");
            System.out.println();
        }



    }

}

