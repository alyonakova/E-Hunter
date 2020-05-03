package space.banka.alyona.e_hunter.product_server.dataproviders.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Influence {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer harmfulness;
}
