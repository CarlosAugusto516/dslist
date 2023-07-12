package com.company.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
