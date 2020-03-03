package codingforfun;

public class DualArray {
	public boolean isDual(int[] arr) {
		int len=arr.length;
		if(arr==null || len==0 ||len%4!=0) return false;
			
		for(int i=0;i+3<len;i+=2) {
			if(arr[i]+arr[i+1]!=arr[i+2]+arr[i+3]) {
		    	return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		DualArray dr =new DualArray();
		int[] a= {1, 2, 3, 0};
		int[] b= {1, 1, 2, 2};
		int[] c= {1,2,3};
		int[] d= {1, 3, 2, 2, 4, 0, 5, -1};
		System.out.println(dr.isDual(a));
		System.out.println(dr.isDual(b));
		System.out.println(dr.isDual(c));
		System.out.println(dr.isDual(d));
	}
}
