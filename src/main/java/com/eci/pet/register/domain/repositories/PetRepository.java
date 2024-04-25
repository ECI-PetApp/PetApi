package com.eci.pet.register.domain.repositories;

import java.util.List;
import java.util.UUID;
import com.eci.pet.register.domain.dtos.PetRequest;
import com.eci.pet.register.domain.entities.Pet;

public interface PetRepository {

    UUID createPet(PetRequest pet);
    List<Pet> getAll();

}
