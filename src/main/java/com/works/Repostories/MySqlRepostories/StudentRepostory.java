package com.works.Repostories.MySqlRepostories;

import com.works.Entity.MySqlEntity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepostory extends JpaRepository<Integer, Student> {
}
