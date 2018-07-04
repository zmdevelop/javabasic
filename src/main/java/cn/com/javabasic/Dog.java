package cn.com.javabasic;

class AnimalException extends Exception {}

class DogException extends AnimalException {}

class OtherException extends Exception{}

public class Dog extends Mammalian{


	public Dog() throws IllegalAccessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void bite(){
		// TODO Auto-generated method stub
		
	}

}
