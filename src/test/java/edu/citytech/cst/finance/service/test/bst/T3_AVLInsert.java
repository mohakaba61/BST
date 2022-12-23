package edu.citytech.cst.finance.service.test.bst;
import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.binarysearchtree.AVLTree;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.binarysearchtree.AVLTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("AVLInsert test by Mohamed Kaba")
public class T3_AVLInsert {

	@DisplayName("insert 1,000,000 items")
	@ParameterizedTest
	@ValueSource(ints = {Integer.MIN_VALUE,100, 200
			, 300, 400, 700,1,2,3,4,5,6,78,45,232,76,22,77, Integer.MAX_VALUE})

	public void t1_searchFor(int numbers) {
		IList<Integer> avlTree = new AVLTree<Integer>();

		var data = IntStream.rangeClosed(1, 1_000_000)
				.boxed().toArray(Integer[]::new);

		avlTree.inserts(data);
		DynamicArray<Integer> da = new DynamicArray<Integer>(Integer[]::new);
		avlTree.findOne(numbers, da::insert);
		final int expected = da.size();
		final int actual = avlTree.height() + 1;

		assertTrue( () -> actual >= expected ,
				" expected:" + expected
		              + " actual:" + actual);
	}


	@DisplayName("Find by Mohamed Kaba ")
	@ParameterizedTest
	@ValueSource(ints ={1431})
	public void t2_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={4899})
	public void t3_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={4939})
	public void t4_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={1424})
	public void t5_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={5914})
	public void t6_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={3149})
	public void t7_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={3188})
	public void t8_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={8192})
	public void t9_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={1008})
	public void t10_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={1381})
	public void t11_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={1083})
	public void t12_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}
	@ParameterizedTest
	@ValueSource(ints ={4657})
	public void t13_Widget1000(int transactionId) {

		IList<Widget> avlTree = new AVLTree<Widget>();
		Widget[] results = WidgetRepository.find();
		avlTree.inserts(results);
		Optional<Widget> exist = avlTree.findOne(new Widget().setTransactionId(transactionId), e -> {} );

		var expected = exist.isPresent();
		var actual = avlTree.height() < 13;
		assertEquals(expected, actual, "height: " + avlTree.height()
				+ "isPresent:" + exist.isPresent() );


	}



}
