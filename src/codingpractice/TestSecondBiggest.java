package codingpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSecondBiggest {

	@Test
	void test() {
		int[] a= {1,2,3,4,5};
		int[] b= {19,9,11,0,12};
		int[] c= {12};
		assertEquals(12,SecondBiggest.findSecondBiggest(b));
		assertEquals(4,SecondBiggest.findSecondBiggest(a));
		assertEquals(Integer.MIN_VALUE,SecondBiggest.findSecondBiggest(c));
	}

}
