
class Object1{
	int age;
	String name;
	void input(String n,int a) {
		age=a;
		name=n;
	}
	void display() {
		System.out.println(name+ " "+age);
	}}
	class Objectmethod {
		public static void main (String[]args) {
			Object1 obr = new Object1();
			Object1 obr1= new Object1();
			obr.input( "a",12);
			obr1.input( "b",13);
			obr.display();
			obr1.display();
		
	
}
}
