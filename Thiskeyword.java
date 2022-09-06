
public class Thiskeyword {
	int rollno;
	 String name;
	 float  fee;
	 static String college="MIT";
	 Thiskeyword (int rollno,  String name,float fee){//parameter
		 this.rollno=rollno;
		 this.name=name;
		 this.fee=fee;
	 }
	 void display() {
		 System.out.println(rollno+" "+name+" "+fee+" "+college);
		 
	 }

static class  Staticvari1{ //cls2
		 public static void main (String[] args) {
			 //object
			 Staticvari s1=new Staticvari(112,"ram",5000);
					 Staticvari s2=new  Staticvari(222,"sham",3000);
					 s1.display();
					 s2.display();
		

	}}}
	
