package com.works.Model.PostgresEntity;

import com.works.Model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School extends BaseEntity {

    private String schoolCode;
    private String schoolname;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cities_id")
    private City city;

}
