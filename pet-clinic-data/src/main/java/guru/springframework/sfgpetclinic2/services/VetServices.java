package guru.springframework.sfgpetclinic2.services;

import guru.springframework.sfgpetclinic2.model.Pet;
import guru.springframework.sfgpetclinic2.model.vet;

import java.util.Set;

public interface VetServices {
    vet findById(Long id);
    vet save(vet vet);
    Set<vet> findAll();
}
