package codingpractice;

import java.util.Arrays;

public class SecondBiggest {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {19,9,11,0,12};
		if(findSecondBiggest(a)==Integer.MIN_VALUE)
			System.out.println("There's no second biggest value in the array '"+Arrays.toString(a)+"'");
		else
			System.out.println("The second Bigger integer in "+Arrays.toString(a)+" is \n"+findSecondBiggest(a));
		if(findSecondBiggest(b)==Integer.MIN_VALUE)
			System.out.println("There's no second biggest value in the array '"+Arrays.toString(b)+"'");
		else
			System.out.println("The second Bigger integer in "+Arrays.toString(b)+" is \n"+findSecondBiggest(b));
	}
	
	public static int findSecondBiggest(int[] arr) {
		if(arr==null || arr.length<2) return Integer.MIN_VALUE;
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
