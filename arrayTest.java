package TestMe;

public class arrayTest {

	//this is an array of movies 
	public static String[] movies = new String[]{"Harry Potter", "Twilight", "Star Wars", "Batman", "Superman"};
	
	public static String[] mystery = new String[5];
	//Throughout this program you will be manipulating and printing what is in the array.
	
	public static void main(String[] args) {
		printArray(movies);
		printArray(mystery(movies));
	}

	private static void printArray(String[] m) {
		for (int x = 0; x < m.length; x++) {
				System.out.println(m[x]);
			}
		}
	
	private static String[] mystery(String[] m) {
		for (int x = 0; x < movies.length-1; x++) {
			mystery[x] = movies[x+1];
		}
		return mystery;
	}
	
	
}
