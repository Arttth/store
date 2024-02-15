package ru.art.goods.controller;

import org.springframework.web.bind.annotation.*;
import ru.art.goods.api.request.GoodRequest;

import java.util.Collection;
import java.util.Collections;

@RestController
public class GoodController {
    @GetMapping("/{id}")
    String getGoodById(@PathVariable int id) {
        return "Good " + id;
    }

    @PostMapping("/")
    String addGood(@RequestBody GoodRequest request) {
        return request.getName();
    }

    @GetMapping("/")
    Collection<String> getGoods() {
        return Collections.emptyList();
    }

    @PatchMapping("/{id}")
    String changeGoodById(@PathVariable int id, @RequestBody GoodRequest request) {
        return "Good changes " + request.getName() ;
    }
}
