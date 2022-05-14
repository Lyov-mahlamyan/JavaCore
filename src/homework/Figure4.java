package homework;

public class Figure4 {
    public static void main(String[] args) {
        for (int i = 5; i <9; i++) {
            for (int j = 2; j<=i; j++ ) {
                System.out.print("  ");
            }
            for (int j = 9; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

