package com.konrad.taller.AngularBack.resource;

import com.konrad.taller.AngularBack.model.AutorModel;
import com.konrad.taller.AngularBack.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/autor")
@RestController
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<AutorModel> obtenerTodos() {
        return autorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public AutorModel obtenerPorId(@PathVariable Integer id) {
        return autorService.obtenerPorId(id);
    }

    @PostMapping
    public void crear(@RequestBody AutorModel autor) {
        autorService.crear(autor);
    }

    @PutMapping
    public void actualizar(@RequestBody AutorModel autor) {
        autorService.actualizar(autor);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id) {
        autorService.eliminar(id);
    }
}
