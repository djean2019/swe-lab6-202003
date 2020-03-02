package codingpractice;

public class PrintHelloWorld {
	public static void main(String[] args) {
		int[] a= {5,7,35,175};
		printHelloWorld(a);
	}
	
	public static void printHelloWorld(int[] arr) {
		if(arr==null || arr.length==0) return;
		
		for(int i:arr) {
			if(i%5==0)
				System.out.println("Hello");
			if(i%7==0)
				System.out.println("World");
			if(i%5==0 && i%7==0)
				System.out.println("HelloWorld");
		}
	}
}
