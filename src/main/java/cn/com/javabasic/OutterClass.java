package cn.com.javabasic;

public class OutterClass {
	
	public Animal getDog(){
	   class Dog implements Animal{

		public void bite() {
			// TODO Auto-generated method stub
			
		}
			
	    	
		} 
	    return new Dog();
	}
	
	//此处方法外是无法访问Dog类，
	
}
