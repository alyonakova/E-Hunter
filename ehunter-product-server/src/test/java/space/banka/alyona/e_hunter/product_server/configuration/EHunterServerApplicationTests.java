package space.banka.alyona.e_hunter.product_server.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Additive;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Barcode;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Influence;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Product;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@SpringBootTest
class EHunterServerApplicationTests {

    @Test
    void contextLoads() {
    }

    private Product fakeProduct() {
        return Product.builder()
                .name("Чипсики Уху")
                .ingredientsText("глутамат натрия, пальмовое масло, Е228")
                .additives(List.of(Additive.builder()
                        .name("Пальмовое масло")
                        .allergen(false)
                        .whereToFind("печеньки")
                        .maxSafeDoseMilligrams(10.1D)
                        .influences(Set.of(
                                Influence.builder()
                                        .name("смерть")
                                        .harmfulness(2)
                                        .build(),
                                Influence.builder()
                                        .name("глюки")
                                        .harmfulness(-1)
                                        .build()))
                        .build()))
                .barcode(Barcode.builder()
                        .number(BigInteger.valueOf(92281488))
                        .build())
                .build();
    }
}
