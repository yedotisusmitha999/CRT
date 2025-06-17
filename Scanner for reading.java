
import java.io.file;
import java.util.scanner;
Scanner sc=new Scanner(new File("data.txt"));
while(sc.hasNextLine()){
System.out.println(sc.nextLine());
}
sc.close();
