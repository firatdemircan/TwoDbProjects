package com.works.Entity.MySqlEntity;

import com.works.Entity.BaseEntity;
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
public class Lesson extends BaseEntity {

    private String lessonCode;
    private String lessonName;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
