public class InsertionSort{
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2}; 
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i;
            while(j>=0)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                j--;
            }
           
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }}