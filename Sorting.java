// Program to sort array without changing the position of negative value.

public class Sorting {

    public static void main(String[] args) {
        int arr[] = { -5, 9, 8, -5, 2, 4, -2, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                while (arr[i] < 0) {
                    i++;
                }
                while (arr[j + 1] < 0) {
                    j++;
                }
                if (arr[i] > arr[j + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}