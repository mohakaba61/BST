package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.array.SingleLinkedList;
import edu.citytech.finance.array.SortedDynamicArray;
import edu.citytech.finance.binarysearchtree.AVLTree;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Mohamed Kaba")
class TE_BinarySearchTree {
	@Test
	@DisplayName("BinarySearchTree sum with number")
	void t1_sumOfBinarySearchTree() {
		BinarySearchTree data= new BinarySearchTree();
		data.inserts(5,3,6,2,4,7,8);

		double expected = 35;
		double actual = data.sum();


		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("BinarySearchTree sum with number")
	void t2_sumOfBinarySearchTree() {
		BinarySearchTree data= new BinarySearchTree();
		data.inserts(3,5,10,32,21);

		double expected = 71;
		double actual = data.sum();

		System.out.println();

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("BinarySearchTree sum with number")
	void t3_sumOfBinarySearchTree() {
		BinarySearchTree data= new BinarySearchTree();
		data.inserts(2,3,4,5,6);

		double expected = 20;
		double actual = data.sum();

		System.out.println();

		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("BinarySearchTree sum with number")
	void t4_sumOfBinarySearchTree() {
		BinarySearchTree data= new BinarySearchTree();
		data.inserts(2,10,11,5,7);
		double expected = 35;
		double actual = data.sum();

		System.out.println();

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("BinarySearchTree sum with number")
	void t5_sumOfBinarySearchTree() {
		BinarySearchTree data= new BinarySearchTree();
		data.inserts(9,8,7,6,5);
		double expected = 35;
		double actual = data.sum();

		System.out.println();

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("BinarySearchTree sum with number")
	void t6_sumOfBinarySearchTree() {
		BinarySearchTree data= new BinarySearchTree();
		data.inserts(3,3,3,3,3);
		double expected = 15;
		double actual = data.sum();

		System.out.println();

		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Sum of SingleLinkedList with widget 10 to 20")
	void t7_sumOfBinarySearchTreeWithWidget() {
		IList<Widget> da=new AVLTree<>();
		var results = WidgetRepository.find(10,20);
		da.inserts(results);
		var sum = da.sum();

		double expected = 757.0;
		double actual = sum;

		System.out.println();

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of BinarySearchTree with widget 3 to 10")
	void t8_sumOfBinarySearchTreeWithWidget() {
		IList<Widget> da=new BinarySearchTree<>();
		var results = WidgetRepository.find(3,10);
		da.inserts(results);
		var sum = da.sum();

		double expected = 531.0;
		double actual = sum;

		System.out.println();

		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Sum of BinarySearchTree with widget 1 to 20")
	void t9_sumOfBinarySearchTreeWithWidget() {
		IList<Widget> da=new BinarySearchTree<>();
		var results = WidgetRepository.find(1,20);
		da.inserts(results);
		var sum = da.sum();

		double expected = 1_326;
		double actual = sum;

		System.out.println();

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of BinarySearchTree with widget 1 to 3")
	void t919_sumOfBinarySearchTreeWithWidget() {
		IList<Widget> da=new BinarySearchTree<>();
		var results = WidgetRepository.find(1,3);
		da.inserts(results);
		var sum = da.sum();

		double expected = 182;
		double actual = sum;

		System.out.println();

		assertEquals(expected, actual);

	}

}