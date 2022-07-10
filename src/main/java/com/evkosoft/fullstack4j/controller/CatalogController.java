package com.evkosoft.fullstack4j.controller;

import com.evkosoft.fullstack4j.model.Item;
import com.evkosoft.fullstack4j.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {


    @Autowired
    private CatalogService catalogService;

    @GetMapping("/")
    public List<Item> getItems() {
        return this.catalogService.getAllItems();
    }
}
