package com.eci.pet.register.application;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.eci.pet.register.domain.dtos.PetRequest;
import com.eci.pet.register.domain.entities.Pet;
import com.eci.pet.register.domain.repositories.PetOwnerRepository;
import com.eci.pet.register.domain.repositories.PetRepository;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class PetUseCase {

    private final PetRepository petRepo;
    private final PetOwnerRepository petOwnerRepository;

    public UUID registerPet(PetRequest pet) { 
        String petOwnerValidation = petOwnerRepository.searchOwnerById(pet.getOwnerId());
        if (petOwnerValidation.contains("Error")) {
            throw new IllegalArgumentException(petOwnerValidation);
        }
        return petRepo.createPet(pet);
    }

    public List<Pet> getAll()
    {
        return petRepo.getAll();
    }
}