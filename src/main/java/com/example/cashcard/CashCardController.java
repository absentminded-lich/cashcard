package com.example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @GetMapping("/{id}")
    public ResponseEntity<CashCard> findById(@PathVariable String id) {
        CashCard cashCard = new CashCard(100L, 0.0);
        return ResponseEntity.ok(cashCard);
    }
}