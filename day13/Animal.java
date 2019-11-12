package day13;

public abstract class Animal {
	public abstract void makesSound(); // All the child class of Animal must make sound in their own way
	                                    // All the child class must override the parent class method 
	                                    // abstract class has abstract method
	                                    //if any class extends(inherits) parent abstract class, then
	                                    // child class must override all the methods in parent class.
	                                   // Can not make object of abstract class
	                                   // can only make reference variable
}
                                     
