package com.pcarpentier.tutospringboot.controllers;

import com.pcarpentier.tutospringboot.entities.Client;
import com.pcarpentier.tutospringboot.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "client")
public class ClientController {

    @Autowired
    ClientService clientService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createClient(@RequestBody Client client)  {
        clientService.createClient(client);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> rechercher() {
        return clientService.rechercher();

    }

}
