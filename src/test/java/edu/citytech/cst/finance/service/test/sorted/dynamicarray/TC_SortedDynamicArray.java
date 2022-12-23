package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.array.SortedDynamicArray;
import junit.framework.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Mohamed Kaba")
class TC_SortedDynamicArray {


	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t1() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(1f,2f,3f);


		var expected=6.0;
		var actual=da.sum();

		Assert.assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t2() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(6f,2f,3f,5f,10f);


		var expected=26.0;
		var actual=da.sum();

		Assert.assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t3() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(100f,50f,20f);


		var expected=170.0;
		var actual=da.sum();

		Assert.assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t4() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(1f,2f,2f,6f,7f);


		var expected=18.0;
		var actual=da.sum();

		Assert.assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t5() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(1f,1f,1f,1f,1f,1f,1f);


		var expected=7.0;
		var actual=da.sum();

		Assert.assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t6() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(4f,8f,12f);


		var expected=24.0;
		var actual=da.sum();

		Assert.assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sorted Dynamic Array (1) with sum ")
	void t7() {
		IList<Float> da = new SortedDynamicArray<>(7, Float[]::new);


		da.inserts(10f, 20f, 30f,40f);


		var expected = 100.0;
		var actual = da.sum();

		Assert.assertEquals(expected, actual);
	}
	@Test
	@DisplayName("Sum of Widgets 1 to 20")
	void t1_sumOfWidgets() {

		IList<Widget> da = new SortedDynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(1,20);
		da.inserts(results);
		var sum = da.sum();

		double expected = 1_326;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of Widgets 1 to 25")
	void t2_sumOfWidgets() {

		IList<Widget> da = new SortedDynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(1,25);
		da.inserts(results);
		var sum = da.sum();

		double expected = 1_593.0;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of Widgets 10 to 20")
	void t3_sumOfWidgets() {

		IList<Widget> da = new SortedDynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(10,20);
		da.inserts(results);
		var sum = da.sum();

		double expected = 757.0;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of Widgets 10 to 40")
	void t4_sumOfWidgets() {

		IList<Widget> da = new SortedDynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(10,40);
		da.inserts(results);
		var sum = da.sum();

		double expected = 1_951.0;
		double actual = sum;

		assertEquals(expected, actual);

	}



}