package space.banka.alyona.e_hunter.product_server.dataproviders.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String ingredientsText;
    @Embedded
    private Barcode barcode;
    @ManyToMany
    @UniqueElements
    private List<Additive> additives;

}
