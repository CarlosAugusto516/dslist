package com.company.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
