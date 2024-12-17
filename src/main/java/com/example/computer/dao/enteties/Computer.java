package com.example.computer.dao.enteties;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Computer {

    @Id
    private  int id_Pc;
    private  String proce;
    private  String ram;
    private  String hardDrive;
    private  float price;
    private  String macAdress;

}
