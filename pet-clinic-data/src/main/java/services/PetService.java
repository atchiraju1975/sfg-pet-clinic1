package services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
