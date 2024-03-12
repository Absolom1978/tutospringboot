package com.pcarpentier.tutospringboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.io.StringBufferInputStream;
@Getter
@Setter
@Entity
@Table(name="CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

}
