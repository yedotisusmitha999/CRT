
import java.io.file;
File myFile=new File("example.txt");
if(myFile.exists())
{
System.out.println("File exists:"+myFile.getName());
}
else
{
System.out.println("Files not exist.");
}
