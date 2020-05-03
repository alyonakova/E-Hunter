package space.banka.alyona.e_hunter.product_server.core.usecase;

import org.springframework.stereotype.Component;
import space.banka.alyona.e_hunter.product_server.dataproviders.crud.ProductRepository;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Barcode;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Product;

import java.util.Optional;

@Component
public class FindProductByBarcode {

    private final ProductRepository productRepository;

    public FindProductByBarcode(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findProductByBarcode(Barcode barcode) {
        return productRepository.findByBarcode(barcode);
    }
}
