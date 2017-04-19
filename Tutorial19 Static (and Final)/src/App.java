// "does it make sense to call this method, even if no Obj has been constructed yet?"
// If so, it should definitely be static.

// It is a variable which belongs to the class and not to object(instance)
class Thing{
	// finals are constant, can not be resigned
	public final static int LUKCY_NUMBER = 7;
	
	public String name;
	// static member variables belong to the class, and there is only
	// one copy
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing(){
		id = count;
		count++;
	}
	
	public void showName(){
		System.out.println("Object id: "  + id + ", " + description + " "+ name);
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
}

public class App {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		System.out.println("before creating objm count is :" + Thing.count);
			
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objm count is :" + Thing.count);
		
		thing1.name ="bob";
		thing2.name ="Sue";
				
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUKCY_NUMBER);
		
	}

}
