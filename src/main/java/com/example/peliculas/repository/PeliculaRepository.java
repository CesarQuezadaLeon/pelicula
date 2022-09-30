package com.example.peliculas.repository;

import com.example.peliculas.model.peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<peliculas,Long> {
}
