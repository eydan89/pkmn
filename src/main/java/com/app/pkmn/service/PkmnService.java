package com.app.pkmn.service;

import com.app.pkmn.model.Pkmn;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface PkmnService {

    ArrayList<Pkmn> getAll();
    Optional <Pkmn> getByNumber(int number);

    Pkmn savePkmn(Pkmn pkmn);

    void saveAllPkmn(ArrayList<Pkmn> pkmnList);

    Boolean deleteByNumber(int number);



}
