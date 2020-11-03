package guru.springframework.sfgpetclinic2.services;

import guru.springframework.sfgpetclinic2.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
