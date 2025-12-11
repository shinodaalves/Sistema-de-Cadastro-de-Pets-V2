package com.projeto.GerenciamentoPets.controller;

import com.projeto.GerenciamentoPets.entities.Pet;
import com.projeto.GerenciamentoPets.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pet")
@RequiredArgsConstructor
public class PetController {
    private final PetService petService;

    @PostMapping
    public void salvarPet(@RequestBody Pet pet) {
        petService.salvarPet(pet);
    }

    @GetMapping
    public void BuscarPetPorId(Long id) {
        petService.buscarPetPorId(id);
    }

    @DeleteMapping
    public void deletarPetPorId(Long id) {
        petService.deletarPetPorId(id);
    }
}

