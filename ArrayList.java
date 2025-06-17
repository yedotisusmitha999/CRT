
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
