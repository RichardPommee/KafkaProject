package com.richard.kafkaproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    int age;

    Date dateofbirth;

    String address;

    String maritualstatus;

    @OneToOne(cascade = CascadeType.MERGE)
    Pensionprovider pensionprovider;


}
