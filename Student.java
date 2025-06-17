
package models;
 
public class Student {
	private int id;
	private String name,reg;
	private int age;
	private float per;
	
	public Student(String name, String reg,int age, float per) {
		this.name=name;
		this.reg=reg;
		this.age=age;
		this.per=per;
	}
	//getteRs
	public int getId() {return id;}
	public String getName() {return name;}
	public String getReg() {return reg;}
	public int getAge() {return age;}
	public float getPer() {return per;}
	
}
