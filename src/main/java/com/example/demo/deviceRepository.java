package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, String> {
    @Query("select d from devices d where d.name = ?1 or d.id = ?1")
    List<Device> findByIDorName(String param);
}
