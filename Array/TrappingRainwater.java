public class TrappingRainwater {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={4,2,0,6,3,2,5};
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int max=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                left[i]=max;
            }
            left[i]=max;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>rmax)
            {
                rmax=arr[i];
                right[i]=rmax;
            }
            right[i]=rmax;
        }
        for(int i=0;i<arr.length;i++)
        {
            int sub=Math.min(left[i],right[i])-arr[i];
            if(sub<0)
            {
                sub=0;
            }
            sum=sum+sub;
        }
        System.out.println(sum);
        
        
    }
}
