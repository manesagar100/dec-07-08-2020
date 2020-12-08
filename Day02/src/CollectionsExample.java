import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsExample {

	public static void main(String[] args) {
		
		List<Integer> lst= Arrays.asList(1, 2, 3, 4, 5);
		
		final List<Integer> evenList = lst
			.stream()
			.filter(e -> e % 2 == 0)
			.collect(Collectors.toList());
			
		System.out.println(evenList);
		
		final Set<Integer> oddList = lst.
				stream()
				.skip(1)
				.filter(e -> e % 2 != 0)
				.collect(Collectors.toSet());
		System.out.println(oddList);

	}

}
