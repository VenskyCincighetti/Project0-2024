package com.store.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.entity.Vent;

@Repository
public interface VentRepository extends JpaRepository<Vent, Integer>{
}
