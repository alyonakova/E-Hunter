package space.banka.alyona.e_hunter.product_server.dataproviders.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Additive {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String eNumber;
    private String function;
    private String whereToFind;
    @ManyToMany
    private Set<Influence> influences;
    private Boolean allergen;
    private Double maxSafeDoseMilligrams;

}
