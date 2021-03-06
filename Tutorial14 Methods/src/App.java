class Person {

	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// Subroutines (methods)
	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " and I am " + age
					+ "years old ");
		}
	}

	void sayHello(){
		System.out.println("Hello there");
	}
}

class Animal {
	String type;
	int age;
	String color;
}

class City {
	String name;
	int population;
	String country;
	
	void info(){
		System.out.println("Info: " + name + " " + population + " " + country);
	}
}

public class App {

	// this is the main method
	public static void main(String[] args) {

		Person person1 = new Person();

		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();

		Animal animal1 = new Animal();

		animal1.type = "dog";
		animal1.age = 14;
		animal1.color = "black";

		System.out.println(animal1.type);

		City city1 = new City();
		city1.name = "New York";
		city1.population = 1337;
		city1.country = "USA";
		city1.info();

		City city2 = new City();
		city2.name = "Helsinki";
		city2.population = 12;
		city2.country = "Finland";

	}
}
