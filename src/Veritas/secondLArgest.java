package Veritas;
import java.util.Arrays;
public class secondLArgest {

    public static int getSecondLargest(int x[]) {
        int count = 0;
        int secondLargest = 0;
        int data[] = x;
        //int data []={45,4,7,4,44,8,9,56,33,46};
        int len = data.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (data[i] < data[j]) {
                    count++;
                }
            }

            if (count == 1) {
                secondLargest = data[i];
                break;
            }

            count = 0;
        }

        return secondLargest;

    }

    public static void main(String[] args) {

        int Dataset[] = {45, 4, 7, 4, 44, 8, 9, 56, 33, 46};
        System.out.println("Array is : "+Arrays.toString(Dataset));
        System.out.println("Second largest is " + getSecondLargest(Dataset));

    }
}
