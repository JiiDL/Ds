package com.example.computer.service;

import com.example.computer.dao.enteties.Computer;
import lombok.AllArgsConstructor;
import com.example.computer.dao.repositories.ComputerRepository;
import com.example.computer.dto.ComputerDTO;
import com.example.computer.mapper.ComputerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ComputerManager implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        return computerMapper.fromComputerToComputerDto(computer);
    }

    @Override
    public List<ComputerDTO> getComputersByProcessor(String proce) {
        return computerRepository.findByProce(proce)
                .stream()
                .map(computerMapper::fromComputerToComputerDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ComputerDTO> getComputersByProcessorAndPrice(String proce, float price) {
        return computerRepository.findByProceAndPrice(proce, price)
                .stream()
                .map(computerMapper::fromComputerToComputerDto)
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteComputer(Integer id) {
        if (computerRepository.existsById(id)) {
            computerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
