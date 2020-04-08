package polymorphism;

abstract class Animal {
	Animal(){
		System.out.println("Constructor - Animal");
	}
	public void sound() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {
	Dog(){
		System.out.println("Constructor - Dog");
	}
	public void sound() {
		System.out.println("Dog");
	}
}

class Cat extends Animal {
	Cat(){
		System.out.println("Constructor - C");
	}
	public void sound() {
		System.out.println("Cat");
	}
}

public class Test {
	public static void main(String[] args) {
		Animal a;
		
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();
	}
}
