package com.example.computer.service;

import com.example.computer.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {

    ComputerDTO saveComputer(ComputerDTO computerDto);

    List<ComputerDTO> getComputersByProcessor(String proce);


    List<ComputerDTO> getComputersByProcessorAndPrice(String proce, float price);

    boolean deleteComputer(Integer id);


}
