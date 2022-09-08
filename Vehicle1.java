//single inheritance

 class Vehicle { //parent cla A
 void running() {
	 System.out.println("running mode on");
 }}
 class Bike extends Vehicle{ // child cls B
	 void run() {
		 System.out.println("bike run mode on");
	 }}
 class Vehicle1{
	public static void main(String[] args) {
	Bike d= new Bike();// obj of child cls bike
	d.run();
	d.running();//parent cls method
	}

}
