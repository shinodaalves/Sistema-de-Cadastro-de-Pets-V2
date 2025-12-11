package com.projeto.GerenciamentoPets.service;

import com.projeto.GerenciamentoPets.entities.Pet;
import com.projeto.GerenciamentoPets.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PetService {
    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public void salvarPet(Pet pet) {
        pet.setDataCadastro(LocalDateTime.now());
        repository.saveAndFlush(pet);
    }

    public void buscarPetPorId(Long id) {
        repository.findById(id);
    }

    public void deletarPetPorId(Long id) {
        repository.deleteById(id);
    }
}
