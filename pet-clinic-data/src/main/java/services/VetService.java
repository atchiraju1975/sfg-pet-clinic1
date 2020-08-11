package services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
