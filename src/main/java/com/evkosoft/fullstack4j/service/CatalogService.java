package com.evkosoft.fullstack4j.service;

import com.evkosoft.fullstack4j.model.Item;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CatalogService {

    public List<Item> getAllItems() {
        return Arrays.asList(new Item("Casquette bleue", "Casquette unisexe en cotton bleu", 15.95),
                new Item("Chapeau soleil", "Chapeau soleil aux motifs floraux", 11.95),
                new Item("Chapeau de plage", "Chapeau de plage à larges bords", 19.95),
                new Item("Casquette d'enfant", "Casquette pour bambin taille 2-4", 11.95),
                new Item("Chapeau de paille", "Chapeau de paille avec ruban zébré", 15.95));
    }
}
