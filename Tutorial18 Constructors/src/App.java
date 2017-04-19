
class Machine{
	private String name;
	private int code;
	
	// your constructor has to have the same name as your class
	// Constructors create and initialize objects
	// while Methods preform operations on objects
	public Machine(){
		this("name",0);
		System.out.println("Constructor running");
		name = "Arnie";			
	}
	
	public Machine(String name){
		System.out.println("2nd construcor running");
		this.name = name;				
	}
	
	public Machine(String name, int code){
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
}


public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		//Machine machine2 = new Machine("Bertie");
		
		//Machine machine3 = new Machine("Chalky",5);
	}

}
