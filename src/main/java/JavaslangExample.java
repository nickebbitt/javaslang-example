import javaslang.Function2;
import javaslang.Tuple;
import javaslang.Tuple2;

public class JavaslangExample {

    public static void main(String[] args) {

        tuples();
        functions();

    }

    private static void tuples() {

        System.out.println("Tuples...\n");

        // (Java, 8)
        Tuple2<String, Integer> java8 = Tuple.of("Java", 8);

        // "Java"
        String s1 = java8._1;
        // 8
        Integer i1 = java8._2;

        System.out.println(s1 + i1);

        // (Javaslang, 2)
        Tuple2<String, Integer> that1 = java8.map(
                s2 -> s2 + "slang",
                i2 -> i2 / 4
        );

        System.out.println(that1);

        // (Javaslang, 2)
        Tuple2<String, Integer> that2 = java8.map(
                (s, i) -> Tuple.of(s + "slang", i / 4)
        );

        System.out.println(that2);

        // "Javaslang 2"
        String that3 = java8.transform(
                (s, i) -> s + "slang " + i / 4
        );

        System.out.println(that3);

    }

    private static void functions() {

        // sum.apply(1, 2) = 3
        Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;

        System.out.println("sum(1, 2) = " + sum.apply(1, 2));

    }
}
