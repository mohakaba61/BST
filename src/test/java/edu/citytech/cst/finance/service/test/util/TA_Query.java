package edu.citytech.cst.finance.service.test.util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import edu.citytech.finance.array.DynamicArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.jbbwebsolutions.ds.facade.IList;
@DisplayName("SingleLinkedList && DynamicArray")
public class TA_Query {
	static IList<String> list = null;		
	static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static Predicate<String> isVowel = input -> {			
		 final String regex = "[aeiouAEIOU]";
		
		 Pattern.compile(regex);
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(input);
	     return matcher.find();			
	};
	static boolean getMyName(String input) {
		
		boolean status = input.equals("B") || input.equals("O") ||  
				input.equals("U") || input.equals("L") ||
				input.equals("E") || input.equals("T");				
				
		return status;
	}
	@BeforeEach
	public void before() {		
		String[] abc = alphabets.split("");		
//		list = new SingleLinkedList<String>(String[]::new);
		list = new DynamicArray<String>(String[]::new);
		list.inserts(abc);
		
	}
	
	@AfterEach
	public void after() {
		list.removeAll();	
	}
	

	@Test
	@DisplayName("Count all letters")
	public void t1() {		
		int actual = list.size();
		int expected = 52;		
		assertEquals(expected, actual);	
	}
	
	@Test
	@DisplayName("Count only vowels")
	public void t2() {
			var results = list.query(isVowel);
			
			int actual = results.length;
			int expected = 10;		
			assertEquals(expected, actual);	
			
	}
	
	@Test
	@DisplayName("Remove Consonant ()")
	public void t3() {
			var results = list.query(isVowel.negate());
			
			int actual = results.length;
			int expected = 42;		
			assertEquals(expected, actual);		
	}
	
	
	@Test
	@DisplayName("Count vowels and sometimes Y")
	public void t4() {
		var results = list.query(isVowel.or(e -> e.equalsIgnoreCase("Y")));		
		int actual = results.length;
		int expected = 12;		
		assertEquals(expected, actual);		
	}
	
	
	@Test
	@DisplayName("See only 1 Y or Y")
	public void t5() {
		var results = list.query( x -> x.compareTo("Y") == 0 || x.compareTo("y") == 0);		
		int actual = results.length;
		int expected = 2;		
		assertEquals(expected, actual);
	}
	

	@Test
	@DisplayName("See data between A and M")
	public void t7() {
		var results = list.query( x -> x.compareTo("A") >= 0 && x.compareTo("M") <= 0);
		for (var pair : results) {
			System.out.print(pair.getValue());
		}
		
		int actual = results.length;
		int expected = 13;		
		assertEquals(expected, actual);		

	}
	
	@Test
	@DisplayName("getmyname")
	public void t8() {
		var results = list.query( TA_Query::getMyName );
		for (var pair : results) {
			System.out.print(pair.getValue());
		}
		
		int actual = results.length;
		int expected = 6;		
		assertEquals(expected, actual);		

	}
	

}