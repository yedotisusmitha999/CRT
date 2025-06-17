
import java.util.*;

public class datatype{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which datatype you want(1 for int and 2 for float):");
        int c=sc.nextInt();
        if(c==1)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            addition(a,b,c);

        }
        else
        {
            float a=sc.nextFloat();
            float b=sc.nextFloat();
            addition(a,b,c);
        }
        sc.close();
    }
    public static void addition(float a,float b,int type)
    {
        if(type==1)
        {
            int sum=(int)a+(int)b;
            System.out.println(sum);
        }
        else
        {
            float sum=a+b;
            System.out.println(sum);
        }
    }
}
