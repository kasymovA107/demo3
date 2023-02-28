package com.example.demo.repository;

import com.example.demo.model.demoClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<demoClient,Long> {
}
