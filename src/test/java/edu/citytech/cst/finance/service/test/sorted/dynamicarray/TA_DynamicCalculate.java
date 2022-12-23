package edu.citytech.cst.finance.service.test.sorted.dynamicarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.citytech.finance.array.DoubleLinkedList;
import edu.citytech.finance.array.DynamicArray;
import edu.citytech.finance.array.SingleLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.widget.Widget;
import com.jbbwebsolutions.ds.facade.widget.WidgetRepository;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@DisplayName("Mohamed Kaba")
class TA_DynamicCalculate {

	@Test
	@DisplayName("Sum of 4 numbers")
	void t1_sumOfNumbers() {
		
		IList<Integer> da = new DynamicArray<>(Integer[]::new);
		
		da.inserts(100,200,300,400);
		var sum = da.sum();
		
		double expected = 1000;
		double actual = sum;
		
		assertEquals(expected, actual);
		
	}
	@Test
	@DisplayName("Sum of 6 numbers")
	void t2_sumOfNumbers() {

		IList<Integer> da = new DynamicArray<>(Integer[]::new);

		da.inserts(100,200,300,400,700,234,665);
		var sum = da.sum();

		double expected = 2599;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of 5 numbers")
	void t3_sumOfNumbers() {

		IList<Integer> da = new DynamicArray<>(Integer[]::new);

		da.inserts(100,200,300,400,700);
		var sum = da.sum();

		double expected = 1700;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of 8 numbers")
	void t4_sumOfNumbers() {

		IList<Integer> da = new DynamicArray<>(Integer[]::new);

		da.inserts(100,200,300,400,300,50,40,10);
		var sum = da.sum();

		double expected = 1400;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of 2 numbers")
	void t5_sumOfNumbers() {

		IList<Integer> da = new DynamicArray<>(Integer[]::new);

		da.inserts( 4,8);
		var sum = da.sum();

		double expected = 12;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of 10 numbers")
	void t6_sumOfNumbers() {

		IList<Integer> da = new DynamicArray<>(Integer[]::new);

		da.inserts(1,2,3,4,5,6,7,8,9,10);
		var sum = da.sum();

		double expected = 55;
		double actual = sum;

		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Sum of Widgets 1 to 20")
	void t2_sumOfWidgets() {
		
		IList<Widget> da = new DynamicArray<>(Widget[]::new);
		
		var results = WidgetRepository.find(1,20);		
		da.inserts(results);
		var sum = da.sum();
		
		double expected = 1_326;
		double actual = sum;
		
		assertEquals(expected, actual);
		
	}
	@Test
	@DisplayName("Sum of Widgets 1 to 25")
	void t3_sumOfWidgets() {

		IList<Widget> da = new DynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(1,25);
		da.inserts(results);
		var sum = da.sum();

		double expected = 1_593.0;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of Widgets 10 to 20")
	void t4_sumOfWidgets() {

		IList<Widget> da = new DynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(10,20);
		da.inserts(results);
		var sum = da.sum();

		double expected = 757.0;
		double actual = sum;

		assertEquals(expected, actual);

	}
	@Test
	@DisplayName("Sum of Widgets 10 to 40")
	void t5_sumOfWidgets() {

		IList<Widget> da = new DynamicArray<>(Widget[]::new);

		var results = WidgetRepository.find(10,40);
		da.inserts(results);
		var sum = da.sum();

		double expected = 1_951.0;
		double actual = sum;

		assertEquals(expected, actual);

	}



}