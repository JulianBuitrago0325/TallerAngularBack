package com.konrad.taller.AngularBack.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "autores")
public class AutorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "autor_id")
    private Integer autorId;

    @Column(name = "nom_autor")
    private String nombres;

    @Column(name = "apell_autor")
    private String apellidos;

    @Column(name = "edad_autor")
    private Integer edad;
}
