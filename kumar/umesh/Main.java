package kumar.umesh;

class Main {

	public static void main(String [] args) {
		for (String s : args) {
			System.out.println("Commnad line args: " + s);
		}

		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello();
	}
}
