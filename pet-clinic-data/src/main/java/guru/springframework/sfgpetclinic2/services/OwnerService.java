package guru.springframework.sfgpetclinic2.services;

import guru.springframework.sfgpetclinic2.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastname(String lastName);
    Owner  findbyId(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
