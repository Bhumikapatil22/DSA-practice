public class SubArrays {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                if (sum < min) {
                    min = sum;
                } 
                if (sum > max){
                    max = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(min+" "+max);
    }
}
