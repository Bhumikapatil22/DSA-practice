public class LinearSearch{

    public static int LinearlySearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr={2,3,5,6,10,7,11}; 
       int key=7;

      int index= LinearlySearch(arr,key);
        if(index==-1)
        {
            System.err.println("Key does not exist");
        }
        else{
            System.err.println("Key exist at index: "+index);
        
        }
    }
}