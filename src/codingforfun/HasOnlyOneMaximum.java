package codingforfun;

public class HasOnlyOneMaximum {
	public static boolean hasOnlyOneMaximum(int[] arr) {
		if(arr==null || arr.length==0) return false;
		
		int max=arr[0];
		int countMax=0;

		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
		    	max=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
		    if(arr[i]==max) {
		    	countMax++;
		    }
		    if(countMax>1) return false;
		}

	    return true;
	}
	
	public static void main(String[] args) {
		int[] a= {-6, 2, 5, 6, -6, 5, 6};
		int[] b= {-6, 2, 5, -6, 5, 6};
		int[] c= {};
		System.out.println(hasOnlyOneMaximum(a));
		System.out.println(hasOnlyOneMaximum(b));
		System.out.println(hasOnlyOneMaximum(c));
	}
}
