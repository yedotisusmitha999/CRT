
import java.io.*;  // Import required classes

// Step 1: Create a class and implement Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;  // Helps with version control during serialization
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Step 2: Create an object of Student
        Student student1 = new Student("Keerthi", 102);

        try {
            // Step 3: Create a FileOutputStream to write to a file
            FileOutputStream fileOut = new FileOutputStream("C://Users//sscha//Desktop//new-java//SE-DSE//student_example.ser");

            // Step 4: Create an ObjectOutputStream to write the object
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Step 5: Write the object to the file
            objectOut.writeObject(student1);
            
            // Close streams
            objectOut.close();
            fileOut.close();

            System.out.println("Serialization Successful! Object saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
