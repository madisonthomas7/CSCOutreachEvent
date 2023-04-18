package starterCode;

public class IntroToLoops {
	
	// This is a comment. We use comments in code to tell others what our code does, or to remind ourselves whenever we forget :)
	
	public static void main(String[] args) {
		createAForLoop();
		createAForEachLoop();
		createAWhileLoop();
	}
	
	//The purpose of this method is to create a for loop. I have commented some starter code, your job is to finish it!
	private static void createAForLoop () {
		
		// for (int = 0; < 5; ++ ){
		//	print your variable 
		//}
	}
	
	//The purpose of this method is to create a while loop. I have commented some starter code, your job is to finish it!
	private static void createAWhileLoop () {
	int numberOfShoes = 5;
	
	while (numberOfShoes > 0) {
		//print the number of shoes by putting the variable name in the parenthesis  
		System.out.println();
		//run the code with the line below commented out and then run it again. What happens? 
		//numberOfShoes--;
		}
	}

	private static void createAForEachLoop() {
		char[] Alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//Print each letter
		for (char letter : Alphabet) {
			//Write the code below this comment to print each letter!
		}
	}
	
}
