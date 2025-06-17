
import java.util.*;
public class add2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("enter hte choice(1:int 2:float):");
		int c=sc.nextInt();
		System.out.println("enter input:");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		addition(a,b,c);
		System.out.println("do like to cont(y or n):");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("y")){
			continue;
		}
		else{
			break;
		}
	}
	}
		
		static void addition(float a,float b,int c){
			if(c==1){
				System.out.println((int)(a+b));
			}
			else{
				System.out.println(a+b);
			}
			
		}
}
