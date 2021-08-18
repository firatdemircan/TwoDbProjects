package com.works.Model.MySqlEntity;

import com.works.Model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity {

    private String schollno;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "student")
    private List<Lesson> lessons;

}
