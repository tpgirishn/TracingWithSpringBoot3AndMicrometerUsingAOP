package au.com.dius.pactworkshop.provider;

import com.thoughtworks.tracing.config.Log;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ProductRepository.class);
    private final Map<String, Product> PRODUCTS = new HashMap<>();

    public List<Product> fetchAll() {
        initProducts();

        return new ArrayList<>(PRODUCTS.values());
    }
    @Log
    public Optional<Product> getById(String id) {
        initProducts();
        return Optional.ofNullable(PRODUCTS.get(id));
    }

    private void initProducts() {
        PRODUCTS.put("09", new Product("09", "CREDIT_CARD", "Gem Visa", "v1"));
        PRODUCTS.put("10", new Product("10", "CREDIT_CARD", "28 Degrees", "v1"));
        PRODUCTS.put("11", new Product("11", "PERSONAL_LOAN", "MyFlexiPay", "v2"));
    }
}
