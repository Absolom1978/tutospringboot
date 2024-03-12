package com.pcarpentier.tutospringboot.services;

import com.pcarpentier.tutospringboot.entities.Client;
import com.pcarpentier.tutospringboot.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void createClient(Client client) {
        clientRepository.save(client);

    }

    public List<Client> rechercher() {
        return clientRepository.findAll();

    }

}
