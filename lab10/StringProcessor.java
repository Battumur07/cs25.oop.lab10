
import java.util.*;
import java.util.function.*;

public class StringProcessor {
    public static void processStrings(List<String> input,
                                      Predicate<String> predicate,
                                      Function<String, String> transformer,
                                      Consumer<String> consumer) {
        input.stream()
             .filter(predicate)
             .map(transformer)
             .forEach(consumer);
    }
}
