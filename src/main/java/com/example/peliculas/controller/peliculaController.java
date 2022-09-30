package com.example.peliculas.controller;

import com.example.peliculas.model.peliculas;
import com.example.peliculas.repository.PeliculaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class peliculaController {
    private final Logger log = LoggerFactory.getLogger((peliculaController.class));
    private PeliculaRepository repo;

    public peliculaController(PeliculaRepository repo) {
        this.repo = repo;
    }

    //Metodos
    //Mostrar Datos
    @GetMapping("/api/pelicula/{id}")
    public ResponseEntity<peliculas> FindOneById(@PathVariable Long id) {
        Optional<peliculas> pelioption = repo.findById(id);
        if (pelioption.isPresent()) {
            return ResponseEntity.ok(pelioption.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/api/pelicula")
    public List<peliculas> findAll(){
        return repo.findAll();
    }
    //Guardar Datos
    @PostMapping("/api/pelicula")
    public ResponseEntity<Object> create(@RequestBody peliculas Peli){
        if(Peli.getId()!= null){
            log.warn("Intenta crear una Pelicula con ID");
            return ResponseEntity.badRequest().build();
        }
        peliculas result = repo.save(Peli);
        return ResponseEntity.ok(result);
    }
    //Actualizar Datos
    @PutMapping("/api/pelicula")
    public ResponseEntity<Object>update(@RequestBody peliculas Peli){
        if (Peli.getId()==null){
            log.warn("La Pelicula que intenta actualizar no existe");
            return ResponseEntity.badRequest().build();
        }
        if (!repo.existsById(Peli.getId())){
            log.warn("La Pelicula no exixte");
            return ResponseEntity.badRequest().build();
        }
        peliculas resul =repo.save(Peli);
        return ResponseEntity.ok(resul);
    }
    //Eliminar Dato
    @DeleteMapping("/api/pelicula/{id}")
    public ResponseEntity<peliculas> delete(@PathVariable Long id){
        try {
            repo.deleteById(id);
        }catch (Exception ex){
            log.error("Error La pelicula no exixte"+ex);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
