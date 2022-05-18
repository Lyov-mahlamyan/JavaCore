package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {7, 13, 18, 38, 23, 26, 27, 30, 33, 35};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

        int max=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("the max number is " +max);

        int min=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (min>array[i]){
                min=array[i];
            }

        }
        System.out.println("the min number is "+min);


        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2==1){
                System.out.print(array[i]+" ");
            }
        }
    int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2==0){
                count++;
            }
        }
        System.out.println();
        System.out.print(count);

        int oddCount = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2==1){
                oddCount++;
            }
        }
        System.out.println();
        System.out.println(oddCount);

        System.out.println();

        int max1=array[0];
        for (int i = 0; i < array.length ; i++) {
            max1 = max1+array[i];
        }
        System.out.println("Gumar@"+" " +max1);




        double max2=array[0];
        for (int i = 0; i < array.length ; i++) {
           max2 = max2+array[i];
        }
        System.out.println(" Mijin tvabanakan@"+" "+ max2/2);
    }

}


