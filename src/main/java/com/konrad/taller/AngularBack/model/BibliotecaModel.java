package com.konrad.taller.AngularBack.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "bibliotecas")
public class BibliotecaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "biblioteca_id")
    private Integer bibliotecaId;

    @Column(name = "nom_biblioteca")
    private String nombre;

    @Column(name = "dire_biblioteca")
    private String direccion;

    @Column(name = "tel_biblioteca")
    private String telefono;
}
