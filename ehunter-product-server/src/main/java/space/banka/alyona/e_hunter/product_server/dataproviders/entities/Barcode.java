package space.banka.alyona.e_hunter.product_server.dataproviders.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.math.BigInteger;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Barcode {

    private BigInteger number;

}
