package com.example.computer.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ComputerDTO {

  private int id_Pc;
  private String proce;
  private String ram;
  private String hardDrive;
  private float price;
  private String macAdress;
}
