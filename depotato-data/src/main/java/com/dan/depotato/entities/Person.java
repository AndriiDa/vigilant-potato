package com.dan.depotato.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "persons")
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity{

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "secondName")
  private String secondName;

}
