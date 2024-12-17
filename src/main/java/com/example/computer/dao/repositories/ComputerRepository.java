package com.example.computer.dao.repositories;

import com.example.computer.dao.enteties.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {

    List<Computer> findByProce(String proce);

    List<Computer> findByProceAndPrice(String proce, float price);

    boolean existsByMacAdress(String macAdress);

}
