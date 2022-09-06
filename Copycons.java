
public class Copycons {
	//variable along with data type
	int age;
	String name;
	// constructor & initiali9ze
	Copycons(int a, String n){
		age=a;
		name=n;
	}
	// constructor to initilize another obj
	Copycons(Copycons c){
		age=c.age;
		name=c.name;
	}
	
	void show() {//method
		System.out.println(age+" "+name);}

	public static void main(String[] args) {
		Copycons b=new Copycons(10,"Ram");
		Copycons b1=new Copycons(b);
		b.show();
		b1.show();
	}

}
