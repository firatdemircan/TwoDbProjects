package com.works.Repostories.MySqlRepostories;

import com.works.Model.MySqlEntity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepostory extends JpaRepository<Student, Integer> {
}
