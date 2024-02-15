package ru.art.goods.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GoodController {
    @GetMapping("/{id}")
    String getGoodById(@PathVariable int id) {
        return "Good " + id;
    }

    @PostMapping("/")
    String addGood() {
        return "Good added";
    }

    @GetMapping("/")
    String getGoods() {
        return "Goods";
    }

    @PatchMapping("/{id}")
    String changeGoodById(@PathVariable int id) {
        return "Good changes " + id;
    }
}
