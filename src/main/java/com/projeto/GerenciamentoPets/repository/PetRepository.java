package com.projeto.GerenciamentoPets.repository;

import com.projeto.GerenciamentoPets.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
