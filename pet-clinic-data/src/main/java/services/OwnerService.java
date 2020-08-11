package services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByID(Long id);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);
    Owner save(Owner owner);

}
