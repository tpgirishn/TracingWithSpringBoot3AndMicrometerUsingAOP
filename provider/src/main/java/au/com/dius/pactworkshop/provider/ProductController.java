package au.com.dius.pactworkshop.provider;


import com.thoughtworks.tracing.config.Log;
import io.micrometer.observation.annotation.Observed;
import io.micrometer.tracing.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ProductController.class);
    private final ProductRepository productRepository;

    private final Tracer tracer;

    @Autowired
    ProductController(ProductRepository productRepository, Tracer tracer) {
        this.productRepository = productRepository;
        this.tracer = tracer;
    }

    @GetMapping("products")
    public List<Product> getAllProducts() {
        return productRepository.fetchAll();
    }
    @Log
    @GetMapping("product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") String id) {
        Optional<Product> product = productRepository.getById(id);
        return ResponseEntity.of(product);
    }
}
