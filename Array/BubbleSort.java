public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 3, 2 };
        int j = 0;
        while (j < arr.length-1) {
            for (int i = 0; i < arr.length - 1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}