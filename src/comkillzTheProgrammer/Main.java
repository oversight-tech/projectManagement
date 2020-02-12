package comkillzTheProgrammer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static Function<Integer,IntStream> data =t-> IntStream.range(0,t).filter(num->num%2==0);

    public static void main(String[] args) {
	// write your code here
        IntStream list = data.apply(30);
        list.forEach(System.out::println);

    }
}
