package com.pcarpentier.tutospringboot.repositories;

import com.pcarpentier.tutospringboot.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}
