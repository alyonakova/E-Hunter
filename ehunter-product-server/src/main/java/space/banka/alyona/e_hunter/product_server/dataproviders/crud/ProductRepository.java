package space.banka.alyona.e_hunter.product_server.dataproviders.crud;

import org.springframework.data.repository.CrudRepository;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Barcode;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Product;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Optional<Product> findByBarcode(Barcode barcode);
}
