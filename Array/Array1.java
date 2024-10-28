//array pass as a referrence 
public class Array1
{
    public static void update(int[] arr,int n)
    {
        n=10;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=1;
        }
       
    } 
    public static void main(String[] args) {
    int arr[]={2,3,4};
    int n=7;//pass by value doesn't change in main function
        update(arr,n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
        System.out.println();
        System.out.println(n);
    }
}
