package com.example.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BillettController {

    public final List<Billett> alleBillett = new ArrayList<>();

    @PostMapping("/lagreBillett")
    public void lagreBillett(Billett innBillett){
        alleBillett.add(innBillett);
    }

    @GetMapping("/henteBillett")
    public List<Billett> hentAlle(){
        return alleBillett;}

    @GetMapping("/slettBillett")
    public void slettAlle(){
        alleBillett.clear();
    }
}