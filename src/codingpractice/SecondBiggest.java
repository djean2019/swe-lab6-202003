package codingpractice;

public class SecondBiggest {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {19,9,11,0,12};
		System.out.println("The second Bigger integer in {1,2,3,4,5} is \n"+findSecondBiggest(a));
		System.out.println("The second Bigger integer in {19,9,11,0,12} is \n"+findSecondBiggest(b));
	}
	
	public static int findSecondBiggest(int[] arr) {
		if(arr==null || arr.length==0) return 0;
		int max=arr[0];
		int secondBig=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		for(int i:arr) {
			if(max>secondBig && secondBig<i && i!=max) {
				secondBig=i;
			}
		}
		return secondBig;
	}
}
