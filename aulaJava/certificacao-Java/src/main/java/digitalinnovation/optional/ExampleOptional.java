package digitalinnovation.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptional {
    public static void main(String[] args) {
        System.out.println("valor inteiro opcional");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("valor decimal opcional");
        OptionalDouble.of(55.5).ifPresent(System.out::println);

        System.out.println("valor longo opcional");
        OptionalLong.of(23L).ifPresent(System.out::println);

        Optional<String> optionalString = Optional.of("valor opcional");

        System.out.println(optionalString.isEmpty());
        System.out.println(optionalString.isPresent());
    }
}
