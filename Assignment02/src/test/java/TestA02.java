import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class TestA02 {
	
	@Test 
    public void testLargestNumber() {
	    List<Integer> testList = new ArrayList<>();
	    testList.add(16);
	    testList.add(19);
	    testList.add(15);
	    int testValue = new Assignment02().largestNumber(testList);
	    assertEquals(19, testValue);
    }

    @Test 
    public void testGreaterList() {
	    List<Integer> testList01 = new ArrayList<>();
	    testList01.add(1);
	    testList01.add(9);
	    testList01.add(7);
	    List<Integer> testValue = new Assignment02().greaterList(testList01, 2);
	    List<Integer> testList02 = new ArrayList<>();
	    testList02.add(9);
	    testList02.add(7);
	    assertEquals(testList02, testValue);
    }

    @Test 
    public void testIntegerString() {
	    List<Integer> testList01 = new ArrayList<>();
	    testList01.add(1);
	    testList01.add(2);
	    testList01.add(5);
	    testList01.add(20);
	    testList01.add(7);
	    List<String> testValue = new Assignment02().integerString(testList01);
	    List<String> testList02 = new ArrayList<>();
	    testList02.add("1");
	    testList02.add("fizz");
	    testList02.add("buzz");
	    testList02.add("fizzbuzz");
	    testList02.add("7");
	    assertEquals(testList02, testValue);
    }
    
}