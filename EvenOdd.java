public class EvenOdd
{
    public static void main(String args[])
    {
        int []arr={2,3,4,5,6};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evencount+=1;
            }
            else
            {
                oddcount+=1;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}