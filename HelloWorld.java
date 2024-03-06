public class HelloWorld
{
	 private void testMethod(){
			for(int i=0;i<10;i++){
				System.out.println("Hello World"+i);
			}
	} /* This is main method */
   public static void main(String[] args)
	  {
		HelloWorld h1 = new HelloWorld();
		h1.testMethod();
	  }
}
