package com.konrad.taller.AngularBack.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "libros")
public class LibroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "libro_id")
    private Integer libroId;

    @Column(name = "nom_libro")
    private String nombre;

    @Column(name = "desc_libro")
    private String descripcion;

    @Column(name = "fecha_publicacion_libro")
    private Date fechaPubliacion;

    @Column(name = "biblioteca_id")
    private BibliotecaModel biblioteca;

    @Column(name = "autor_id")
    private AutorModel autor;
}
