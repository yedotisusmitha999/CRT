
import java.io.*;
import java.util.Scanner;
public class StudentFileIO{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			BufferedWriter writer=new BufferedWriter(new FileWriter("Students.txt"));
			System.out.print("Enter number of students:");
			int count=sc.nextInt();
			sc.nextLine();
			for(int i=1;i<count;i++){
				System.out.print("Enter name of student"+i+":");
				String name=sc.nextLine();
				writer.write(name);
				writer.newLine();
			}
			writer.close();
			System.out.println("\n Reading student names from file:");
			BufferedReader reader=new BufferedReader(new FileReader("Students.txt"));
			String line;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
