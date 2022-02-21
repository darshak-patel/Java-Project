package A01;

public class Main {
	
	public static void main(String args[]) {
		Person person = new Person("Darshak", 23);
		
		try {
			person.changeDogsName("Miky");
		} catch(Exception e) {
			System.out.println("Unable to change dog's name " + e.getMessage());
		}
	}
}
