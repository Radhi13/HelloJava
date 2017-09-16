
package first.java;
import java.util.Arrays;

public class HelloWorld {
	public void printname(String name) {
		 System.out.println("Passed1 Name is :" + name);
	}
	public void printrollno(int rolno) {
		 System.out.println("Passed1 rollno is :" + rolno);
	}	
	
//	public HelloWorld(String name, int rollno) {
	      // This constructor has one parameter, name.
	//      System.out.println("Passed Name is :" + name + rollno);
	  // }
	      
	      public static void main(String []args) {
		      // Following statement would create an object myName
		      HelloWorld myName = new HelloWorld();
		      myName.printname("Radhika Hegde");
		      myName.printrollno(1234);
		      int array[] = { 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		      System.out.print(array);
		      Arrays.sort(array);
		      System.out.print(array);
		      printArray("Sorted Array", array);
		      int index = Arrays.binarySearch(array, 2);
		      System.out.println("Found 2 @ " + index);
	   }
private static void printArray(String message, int array[]) {
	// TODO Auto-generated method stub
	System.out.println(message +": [lenght: " + array.length +"]");
	for (int i = 0; i < array.length; i++) {
		
        if(i != 0) {
         System.out.print(", "); 
        }
        System.out.print(array[i]);                     
     }
     System.out.println();
  }
}
	      


