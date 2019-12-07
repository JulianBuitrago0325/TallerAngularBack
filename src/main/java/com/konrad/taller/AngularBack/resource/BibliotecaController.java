package com.konrad.taller.AngularBack.resource;

import com.konrad.taller.AngularBack.model.BibliotecaModel;
import com.konrad.taller.AngularBack.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/biblioteca")
@RestController
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @GetMapping
    public List<BibliotecaModel> obtenerTodos() {
        return bibliotecaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public BibliotecaModel obtenerPorId(@PathVariable Integer id) {
        return bibliotecaService.obtenerPorId(id);
    }

    @PostMapping
    public void crear(@RequestBody BibliotecaModel biblioteca) {
        bibliotecaService.crear(biblioteca);
    }

    @PutMapping
    public void actualizar(@RequestBody BibliotecaModel biblioteca) {
        bibliotecaService.actualizar(biblioteca);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id) {
        bibliotecaService.eliminar(id);
    }
}
