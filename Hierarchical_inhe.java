//hierarchical inheri
class Vehicle3  { //parent cla A
 void running() {
	 System.out.println("running mode on");
 }}
 class Bike2 extends Vehicle3 { // child cls B
	 void run() {
		 System.out.println("bike run mode on");
	 }}
 class Car1 extends Vehicle3 { // child cls c
	 void Speed() {
		 System.out.println("bike r");
	 }}
public class Hierarchical_inhe {

	public static void main(String[] args) {
		Car1 d= new Car1();
		d.running();
		d.Speed();
		Bike2 b=new Bike2();
		b.run();
		b.running();
		
	}

}
