package com.works.Model;

import lombok.Data;

import javax.persistence.*;
@Data
@MappedSuperclass
public class BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
