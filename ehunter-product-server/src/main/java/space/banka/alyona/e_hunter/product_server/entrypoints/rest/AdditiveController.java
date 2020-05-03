package space.banka.alyona.e_hunter.product_server.entrypoints.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import space.banka.alyona.e_hunter.product_server.dataproviders.entities.Additive;
import space.banka.alyona.e_hunter.product_server.dataproviders.crud.AdditiveRepository;

@RestController
public class AdditiveController {

    private final AdditiveRepository additiveRepository;

    public AdditiveController(AdditiveRepository additiveRepository) {
        this.additiveRepository = additiveRepository;
    }

    @GetMapping("/additive")
    public Iterable<Additive> findAllAdditives() {
        return additiveRepository.findAll();
    }

}
