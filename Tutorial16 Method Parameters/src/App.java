class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + "meters in direction " + direction);
	}
	
	public void addTogether(int number,int number2){
		System.out.println(number + number2);
	}
}



public class App {

	public static void main(String[] args) {
		Robot sam = new Robot();
		// This is called passing a parameter
		sam.speak("Hi I'm Sam.");
		sam.jump(7);
		sam.move("West",12.3);
		
		String greeting = "Hello there";
		sam.speak(greeting);
		
		int value = 14;
		sam.jump(value);
		
		sam.addTogether(4, 7);
	}

}
