public class LargestElement {
    public static int largeElement(int[] arr)
    {
        int l=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];
            }
            if(arr[i]<s){
                s=arr[i];
            }

        }
        System.out.println("Smallest value is: "+s);
        return l;
    }
    public static void main(String[] args) {
        int arr[]={22,5,8,10,15,7,9};
        int l=largeElement(arr);
        System.out.println("Largest value is: "+ l);
    }
}
