public class BinarySearch {
   
    public static void main(String args[])
    {
        int[] arr={2,6,3,7,1,9,4};
        int i=0,beg,mid,end;
        beg=i;
        end=(arr.length)-1;
        mid=(beg+end)/2;
        int target=3;

        if(target<mid)
        {
            beg=0;
            end=mid-1;
            mid=(beg+end)/2;
        }
        if(target>mid)
        {
            beg=mid-1;
            end=(arr.length)-1;
            mid=(beg+end)/2;
        }
    }
}
