package stream;

import java.util.stream.Stream;

public class StreamIteratorDemo {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 5).filter(element -> element % 10 == 0).limit(10)
				.forEach(System.out::println);
	}

}
