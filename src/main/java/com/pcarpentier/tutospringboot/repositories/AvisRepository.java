package com.pcarpentier.tutospringboot.repositories;

import com.pcarpentier.tutospringboot.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long> {
}
