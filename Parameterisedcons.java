
public class Parameterisedcons {

	 int age;
	 String name;
	 Parameterisedcons(int a,String n){
		 age=a;
		 name=n;
	 }
		void show() {//method to display
			System.out.println(age+ " "+name);}
			public static void main(String[] args) {
				Parameterisedcons d=new  Parameterisedcons(22,"ram");
				Parameterisedcons d1= new  Parameterisedcons(23,"sham");
			d.show();
			d1.show();
	}

}
