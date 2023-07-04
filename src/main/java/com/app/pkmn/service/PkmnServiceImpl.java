package com.app.pkmn.service;

import com.app.pkmn.model.Pkmn;
import com.app.pkmn.repository.PkmnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PkmnServiceImpl implements PkmnService {

    @Autowired
    PkmnRepository pkmnRepository;

    @Override
    public ArrayList<Pkmn> getAll() {
        return (ArrayList<Pkmn>) pkmnRepository.findAll();
    }

    @Override
    public Optional<Pkmn> getByNumber(int number) {

        return pkmnRepository.findById(number);
    }

    @Override
    public Pkmn savePkmn(Pkmn pkmn) {

        return pkmnRepository.save(pkmn);

    }

    @Override
    public void saveAllPkmn(ArrayList<Pkmn> all){
        pkmnRepository.saveAll(all);
    }

    @Override
    public Boolean deleteByNumber(int number) {
        try {
            Optional <Pkmn> pkmn = pkmnRepository.findById(number);
            pkmnRepository.delete(pkmn.get());

            return true;
        } catch (Exception e) {
            return false;
        }


    }
}
