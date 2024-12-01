public class ReverseArray{
    public static void main(String[] args) {
        int arr[]={9,6,5,3};
        int left=0;
        int right=arr.length-1;
        while(left<=arr.length/2 && right>=arr.length/2)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        
    }
}