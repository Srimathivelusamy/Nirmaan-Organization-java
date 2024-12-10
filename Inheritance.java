package Day13;

 class Animal {
	 void makeSound()
	 {
		 System.out.println("This animal make a sound");
	 
	 }
 }
 class Dog extends Animal{
	 @Override
	 void makeSound() {

	 System.out.println("The dog barks");
	 }
 }
 class Cat extends Animal{
	 @Override
	 void makeSound() {
	 
	 System.out.println("The cat meows");
	 }
	 }
 public class Inheritance{  
	 
	 public static void main(String args[]) {
	 Dog dog = new Dog();
    	dog.makeSound();
	 Cat cat = new Cat();
	 cat.makeSound();
	
 }
	 
 }
	 
	 

