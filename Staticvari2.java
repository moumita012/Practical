public class Staticvari2 {
 int rollno;
 String name;
 float  fee;
 static String college="MIT";
 static void change() {
	 college=" jis";}
 //CONStructor
 Staticvari2 (int rollno,  String name,float fee){
	 this.rollno=rollno;
	 this.name=name;
	 this.fee=fee;
 }
 //method
 void display() {
	 System.out.println(rollno+" "+name+" "+fee+" "+college);
 }
  static class  Staticvari1{//cls2
	  public static void main(String[] args) {
		  Staticvari2.change();
		 
		 //object
		 Staticvari2 s1=new Staticvari2 (102,"ram",5000);
				 Staticvari2 s2=new  Staticvari2(222,"sham",3000);
				 s1.display();
				 s2.display();
	  }}}