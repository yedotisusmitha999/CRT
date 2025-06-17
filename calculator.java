import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which datatype you want(1 for int or 2 for float)");
        int ch=sc.nextLine();
        if(ch=1){
            int a=sc.nextInt();
            int b=sc.nextInt();
        }
        else
        {
            float a=sc.nextFloat();
            float b=sc.nextFloat();
        }
        public static float calculator(float a,float b,int c)
        {
            switch (ch) {
                case 1:
                    c=a+b;
                    break;
                case 2:
                    c=a-b;
                    break;
                case 3:
                    c=a*b;
                    break;
                case 4:
                    c=a/b;
                    break;
                case 5:
                    c=a%b;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
            System.out.println(c);
        }
    }
}
