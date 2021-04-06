package outofscopelearning;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static thinkinginjava.Utils.print;

public class StreamsTest {
		public static void main(String[] args) {
				List<Integer> values = new ArrayList<>();
				Stream<Integer> vs = values.parallelStream();
				IntStream.range(1, 1000001).forEach(values::add);

				long time = getTime();
				int sum = 0;
				for (Integer integer : values) {
						sum += integer;
				}
				print(sum + "; " + (getTime() - time));

				time = getTime();
				print(vs.reduce(0, Integer::sum) + "; " + (getTime() - time));

		}

		public static Integer increment(Integer i) {
				return i++;
		}

		public static Long getTime() {
				return new Date().getTime();
		}
}
