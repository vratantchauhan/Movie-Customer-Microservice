package com.vratant.movieselectionapi.dao;

import com.vratant.movieselectionapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie,Integer> {
}
