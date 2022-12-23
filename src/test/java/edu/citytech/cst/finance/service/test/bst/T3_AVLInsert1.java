package edu.citytech.cst.finance.service.test.bst;
import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.binarysearchtree.AVLTree;
import edu.citytech.finance.binarysearchtree.BinarySearchTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("AVLInsert test by Mohamed Kaba")
public class T3_AVLInsert1 {

	/**
	 * the numbers( 11,12,32,100,787,96,55) are the sequence ID, and
	 * my maxT methods returns last node the maximum Transaction ID.787 has the highest transaction id.
	 */
	@DisplayName("Find by Mohamed Kaba using Widget  ")
	@Test
	public void t1_WidgetMaxT() {

		IList<Widget> avlTree = new BinarySearchTree<>();
		Widget[] results = WidgetRepository.find(11,12,32,100,787,96,55);
		avlTree.inserts(results);

		Optional<Widget> exist = avlTree.maxT();


		var expected = exist.get().getTransactionId();
		System.out.println(expected);
		var actual = 9991;
		assertEquals(expected, actual);


	}

	@DisplayName("Find by Mohamed Kaba,getting the max number  ")
	@Test
	public void t2_NumberMaxT() {

		AVLTree av= new AVLTree();
		av.inserts(2,4,5,76,7,8);

		Optional ma= av.maxT();
		var expected  =ma.get();
		var actual =76;

		assertEquals(expected, actual);
	}

	@DisplayName("Find by Mohamed Kaba,getting the String Maximum ")
	@Test
	public void t3_StringMaxT() {

		AVLTree av= new AVLTree();
		av.inserts("Ba", "Aa","Ka", "Za", "Ga");

		Optional ma= av.maxT();
		var expected  =ma.get();
		var actual ="Za";

		assertEquals(expected, actual);
	}
	@DisplayName("Find by Mohamed Kaba,getting the maximum character  ")
	@Test
	public void t4_MaxCharacterT() {

		AVLTree av= new AVLTree();
		av.inserts('a','b','c','d','e');

		Optional ma= av.maxT();
		var expected  =ma.get();
		var actual ='e';

		assertEquals(expected, actual);
	}


	@DisplayName("Find by Mohamed Kaba,getting the String Minimum ")
	@Test
	public void t5_StringMinT() {

		AVLTree av= new AVLTree();
		av.inserts("Ba", "Aa","Ka", "Za", "Ga");

		Optional mi= av.minT();
		var expected  =mi.get();
		var actual ="Aa";

		assertEquals(expected, actual);
	}
	@DisplayName("Find by Mohamed Kaba, getting the minimum number  ")
	@Test
	public void t6_NumberMinT() {

		AVLTree av= new AVLTree();
		av.inserts(1,2,3,4);

		var  ave= av.average();

		System.out.println(ave);


	}
	@DisplayName("Find by Mohamed Kaba using Widget  ")
	@Test
	public void t3_WidgetMaxT() {

		IList<Widget> avlTree = new BinarySearchTree<>();
		Widget[] results = WidgetRepository.find(11,12,32,100,787,96,55);
		avlTree.inserts(results);

		Optional<Widget> exist = avlTree.maxT();


		var expected = exist.get().getTransactionId();
		System.out.println(expected);
		var actual = 9991;
		assertEquals(expected, actual);


	}
}
