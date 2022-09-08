//multilevel
class Vehicle2 { //parent cla A
 void running() {
	 System.out.println("running mode on");
 }}
 class Bike1 extends Vehicle2 { // child cls B
	 void run() {
		 System.out.println("bike run mode on");
	 }}
 class Car extends  Bike1{ // child cls c
	 void Speed() {
		 System.out.println("bike r");
	 }}
 
public class Multilevel_inhe {

	public static void main(String[] args) {
		Car d= new Car();
		d.running();
		d.run();
		d.Speed();

	}

}
