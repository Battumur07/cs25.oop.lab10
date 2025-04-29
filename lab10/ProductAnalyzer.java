
import java.util.*;
import java.util.stream.*;

public class ProductAnalyzer {
    public static Map<String, List<Product>> analyze(List<Product> products) {
        return products.stream()
                .filter(p -> p.getPrice() > 1000)
                .sorted(Comparator.comparing(Product::getCategory)
                        .thenComparing(Comparator.comparingInt(Product::getPrice).reversed()))
                .collect(Collectors.groupingBy(Product::getCategory));
    }
}
