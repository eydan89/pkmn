package com.app.pkmn.repository;
import com.app.pkmn.model.Pkmn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PkmnRepository extends CrudRepository<Pkmn,Integer> {
}
