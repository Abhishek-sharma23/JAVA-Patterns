import java.util.*;
public class q5
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((i%2==0)?("X")+" ":(a++)+" ");
            }
            System.out.println();
        }
    }
}