public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 9, 1, 2 };
        int index=0;
       for (int i = 0; i < arr.length-1; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i ; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index] = arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
