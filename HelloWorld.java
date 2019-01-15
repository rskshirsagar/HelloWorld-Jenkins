public class HelloWorld
{
	 private void testMethod(){
			for(int i=0;i<10;i++){
				System.out.println("Hello "+i);
			}
	}
   public static void main(String[] args)
	  {
		HelloWorld h1 = new HelloWorld();
		h1.testMethod();
	  }
}
