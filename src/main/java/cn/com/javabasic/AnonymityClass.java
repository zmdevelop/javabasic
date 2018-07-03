package cn.com.javabasic;

public class AnonymityClass {
	
	/*private class Dog implements Animal{

		public void bite() {
			// TODO Auto-generated method stub
			System.out.println("wang wang");
			
		}

	}*/
	
	
	public Animal getDog(final int num){
		final int gg = 8;
		return new Animal(){
			public void bite() {
				// TODO Auto-generated method stub
				System.out.println(gg);
				System.out.println("wang wang");
			}
		};
	}
	
}
