package com.works.Repostories.MySqlRepostories;

import com.works.Model.MySqlEntity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepostory extends JpaRepository<Lesson, Integer> {
    Lesson getById(int id);
}
