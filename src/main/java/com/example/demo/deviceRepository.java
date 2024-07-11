package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface deviceRepository extends JpaRepository<device1, String> {
    @Query("select d from devices d where d.name = ?1 or d.id = ?1")
    List<device1> findByIDorName(String param);
}
