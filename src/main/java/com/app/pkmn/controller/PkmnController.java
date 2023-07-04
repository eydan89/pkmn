package com.app.pkmn.controller;


import com.app.pkmn.model.Pkmn;
import com.app.pkmn.service.PkmnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PkmnController {


    @Autowired
    PkmnService pkmnService;


    @GetMapping("/saludar")
    public String greetings(){
        return "hello guy";
    }

    @GetMapping("/all")
    public ArrayList <Pkmn> getAll(){
        return pkmnService.getAll();
    }

    @GetMapping("/{number}")
    public Optional<Pkmn> getByNumber(@PathVariable("number") int number){
        return pkmnService.getByNumber(number);
    }

    @PostMapping("/save")
    public Pkmn savePkmn(@RequestBody Pkmn pkmn){

        return pkmnService.savePkmn(pkmn);

    }

    @PostMapping("/saveall")
    public String saveAllPkmn(@RequestBody ArrayList<Pkmn> all){
        pkmnService.saveAllPkmn(all);
        return "all pokemon added succesfully";
    }

    @DeleteMapping("/{number}")
    public String deleted(@PathVariable("number") int number){
        if(pkmnService.deleteByNumber(number)){
            return number + " deleted successfully";
        }else{
            return number + " not found, not deleted"   ;
        }
    }

}
