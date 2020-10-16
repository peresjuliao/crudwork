package com.devsuperior.crudwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.crudwork.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
