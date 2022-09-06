// static use no need to create object

public class Staticvari {
	//instance variable decle
 int rollno;
 String name;
 float  fee;
 static String college="MIT";
 
 //Constructor
 Staticvari(int rollno,  String name,float fee){//parameter
	 this.rollno=rollno;
	 this.name=name;
	 this.fee=fee;
 }
 //method
 void display() {
	 System.out.println(rollno+" "+name+" "+fee+" "+college);
	 
 }
 	static class  Staticvari1{ //cls2
	 public static void main(String[] args) {
		 //object
		 Staticvari s1=new Staticvari(102,"ram",5000);
				 Staticvari s2=new  Staticvari(222,"sham",3000);
				 s1.display();
				 s2.display();
	

}}}
