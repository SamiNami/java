
class Person{
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	// 1. Data
	// Subroutines (methods)
}

class Animal{
	String type;
	int age;
	String color;
}

class City{
	String name;
	int population;
	String country;
}

public class App {
	
	// this is the main method
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		Animal animal1 = new Animal();
		
		animal1.type = "dog";
		animal1.age = 14;
		animal1.color = "black";
		
		System.out.println(animal1.type);
		
		
		City city1 = new City();
		city1.name = "New York";
		city1.population = 1337;
		city1.country = "USA";
		
		City city2 = new City();
		city2.name = "Helsinki";
		city2.population = 12;
		city2.country = "Finland";
		
	}
}
