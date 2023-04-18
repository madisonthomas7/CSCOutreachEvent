package TestMe;


public class loopingTest {
    private static int north, south = 0;
	
    public static void test2(int a){
	    int num = a - 2;
	    System.out.print("x");      
	    while(num > 0){             
	        System.out.print(" ");  
	        num--;
	    }
	    System.out.println("x"); 
	}
	   public static void input(){
	        north = 5;
	        south = 5;
	    }
	   
	   public static void test1(int x){
	        while(x >= 1){
	            System.out.print("x");
	            x--;
	        }
	    }
	public static void main(String[] args) {
	    input();
	    test1(north);          
	    System.out.println();
	    int east = south - 2;
	    while (east > 0) {         
	        test2(north);
	        east--;
	    }
	    test1(north);          
	    System.out.println();
	}
}
