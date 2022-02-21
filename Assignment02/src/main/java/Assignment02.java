import java.util.List;
import java.util.stream.Collectors;

public class Assignment02 {
	
	public Integer largestNumber(List<Integer> myList) {
		return myList.stream().mapToInt(v -> v).max().orElse(Integer.MAX_VALUE);
		}

	public List<Integer> greaterList(List<Integer> myList, Integer n) {
		return myList.stream().filter(l -> l > n).collect(Collectors.toList());
		}

	public List<String> integerString(List<Integer> myList) {
		return myList.stream().map(l -> l % 10 == 0 ? "fizzbuzz" : l % 5 == 0 ? "buzz" : l % 2 == 0 ? "fizz" : l.toString()).collect(Collectors.toList());
		}
	
}