public class PairsInArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
                {
                    System.out.print(arr[i]+","+arr[j]+" ");
                }
                System.out.println();
        }
    }
}
