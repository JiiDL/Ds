package com.example.computer.web;

import com.example.computer.dto.ComputerDTO;
import com.example.computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDto) {
        return computerService.saveComputer(computerDto);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce) {
        return computerService.getComputersByProcessor(proce);
    }
}
