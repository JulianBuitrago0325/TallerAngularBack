package com.konrad.taller.AngularBack.resource;

import com.konrad.taller.AngularBack.model.LibroModel;
import com.konrad.taller.AngularBack.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/libro")
@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<LibroModel> obtenerTodos() {
        return libroService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public LibroModel obtenerPorId(@PathVariable Integer id) {
        return libroService.obtenerPorId(id);
    }

    @PostMapping
    public void crear(@RequestBody LibroModel libro) {
        libroService.crear(libro);
    }

    @PutMapping
    public void actualizar(@RequestBody LibroModel libro) {
        libroService.actualizar(libro);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id) {
        libroService.eliminar(id);
    }
}
