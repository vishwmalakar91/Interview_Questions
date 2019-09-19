package Amazon;

public class Median {

    public static int calculateMedian() {
        int first[] = {2, 7, 9, 11};
        int second[] = {1, 5, 10, 12, 13};
        int temp = 0;
        int median = 0;

        int len1 = first.length;
        int len2 = second.length;
        int lenf = len1 + len2;
        int[] fin = new int[lenf];

        for (int i = 0; i < len1; i++) {
            fin[i] = first[i];
        }

        for (int j = 0; j < len2; j++) {
            fin[len1 + j] = second[j];
        }


        for (int k = 0; k < lenf; k++) {
            System.out.print(fin[k] + ",");
        }
        System.out.print("\n");

        for (int i = 0; i < fin.length; i++) {
            for (int j = i + 1; j < fin.length; j++) {
                if (fin[i] > fin[j]) {
                    temp = fin[i];
                    fin[i] = fin[j];
                    fin[j] = temp;
                }
            }
        }

        int n;
        for (n = 0; n < lenf; n++) {
            System.out.print(fin[n] + ",");
        }

        if ((lenf % 2) == 0) {
            median = ((fin[lenf / 2] + fin[(lenf / 2) - 1]) / 2);
        } else {
            median = fin[lenf / 2];
        }
        return median;

    }

    public static void main(String[] args) {

        System.out.println("\nMedian is : " + calculateMedian());
    }
}
