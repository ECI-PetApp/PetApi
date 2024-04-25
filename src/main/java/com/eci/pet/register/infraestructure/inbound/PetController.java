package com.eci.pet.register.infraestructure.inbound;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eci.pet.register.application.PetUseCase;
import com.eci.pet.register.domain.dtos.PetRequest;
import com.eci.pet.register.domain.entities.Pet;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pet")
@AllArgsConstructor
public class PetController {
    private final PetUseCase petUseCase;

    @PostMapping
    public ResponseEntity<UUID> createPet(@RequestBody PetRequest pet)
    {
        return ResponseEntity.ok(petUseCase.registerPet(pet));
    }

    @GetMapping
    public ResponseEntity<List<Pet>> getPets() {
        return ResponseEntity.ok(petUseCase.getAll());
    }
}
