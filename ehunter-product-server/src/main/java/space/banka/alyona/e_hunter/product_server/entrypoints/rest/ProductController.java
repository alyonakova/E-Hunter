package space.banka.alyona.e_hunter.product_server.entrypoints.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Barcode;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Product;
import space.banka.alyona.e_hunter.product_server.core.usecase.FindProductByBarcode;

import java.math.BigInteger;
import java.util.Optional;

@RestController
public class ProductController {

    private final FindProductByBarcode findProductByBarcode;

    public ProductController(FindProductByBarcode findProductByBarcode) {
        this.findProductByBarcode = findProductByBarcode;
    }

    @GetMapping("/products/by-barcode/{barcode}")
    public ResponseEntity<Product> findProductByBarcode(@PathVariable("barcode") BigInteger barcodeNumber) {
        Barcode barcode = Barcode.builder().number(barcodeNumber).build();
        Optional<Product> product = findProductByBarcode.findProductByBarcode(barcode);
        return ResponseEntity.of(product);
    }
}
