import java.util.stream.IntStream;

public class EvenNoCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.rangeClosed(0, 100)
					.filter(x -> x%2 == 0)
					.forEach(System.out::println);
	}

}
