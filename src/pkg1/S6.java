//Use of Super Keyword
package pkg1;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal {
	public void animalSound() {
		super.animalSound(); // Calling the superclass method
	    System.out.println("The dog says: bow wow");
	  }
	}
class Cat extends Dog {
	public void animalSound() {
		super.animalSound(); // Calling the superclass method
	    System.out.println("The cat says: meow meow");
	  }
	}

	public class S6 {
	   public static void main(String[] args) {
	      Animal myDog = new Cat(); // Create a Dog object
	      myDog.animalSound();
	   }
	}
