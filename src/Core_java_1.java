import java.util.ArrayList;

public class Core_java_1 
{
	public static void main(String[] args) 
	{
		//Data Type and Variable
		   //Data Type used below: int, string, char, double, float etc...
		  // Variable used below: number, character, letter, decimal, dec etc...
		int number=5322;
		System.out.println("The integer Number is "+ number);
		String character= "Henish Ruwala";
		System.out.println("My Name is "+ character);
		char letter = 'H';
		System.out.println(letter);
		double decimal=53.22;
		System.out.println("The Decimal Number Is "+ decimal);
		float dec=(float) 5.22;
		System.out.println("The Decimal Number Is "+ dec);
		
		//Working with Arrays
		 //Method 1:
		  int[] arr= new int[5];
		  arr[0]=5;
		  arr[1]=6;
		  arr[2]=9;
		  arr[3]=7;
		  arr[4]=4;
		  System.out.println("The Number is "+ arr[2]);
		  
		 //Method 2:
		  int[] arr2= {1,6,9,8,3,7,5,151,156,65,59,25};
		  System.out.println("The Number Is "+ arr[1]);
		  
		//Loops And Condition
		  //for Loop:
		  for(int i=0; i<arr.length; i++) //arr.length 
		  {
			  System.out.println("The Array Number is "+ arr[i]);
		  }
		  //for loop for method 2 of array
		  for(int i=0; i<arr2.length; i++) //arr.length 
		  {
			  System.out.println("The Array Number is "+ arr2[i]);
		  }
		 String[] name= {"Ruwala","Henish","Rakeshbhai"};
		 for (int i=0; i<name.length; i++)
		 {
			 System.out.println(name[i]);
		 }
		 //Enhanced for loop
		 for(String s: name) 
		 {
			 System.out.println(s);
		 }
		 //if-else condition
		 for(int a=0; a<arr2.length; a++)
		 {
			 if(arr2[a] % 2 ==0)
			 {
				 System.out.println("The Even Numbers is "+arr2[a]);
			 }
			 else 
			 {
				 System.out.println("The Odd Number is " +arr2[a]);
			 }
		 }
		//Arraylist:
		 ArrayList<String> h= new ArrayList<String>();
		 h.add("Ruwala");
		 h.add("Henish");
		 h.add("Rakeshbhai");
		 System.out.println(h.get(1));
		
		//String in Java
		 String s="Ruwala Henish Rakeshbhai";
		 String[] spllittedstring= s.split(" ");
		 System.out.println(spllittedstring[0]);
		 System.out.println(spllittedstring[1]);
		 System.out.println(spllittedstring[2]);
		 for(int q=0; q<s.length(); q++) 
		 {
			 System.out.println(s.charAt(q));
		 }
		// to print reverse order string 
		 for(int w=s.length()-1; w>=0; w--) 
		 {
			 System.out.println(s.charAt(w));
		 }

		

	}

}
