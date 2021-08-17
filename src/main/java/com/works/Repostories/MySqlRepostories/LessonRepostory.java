package com.works.Repostories.MySqlRepostories;

import com.works.Entity.MySqlEntity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepostory extends JpaRepository<Integer, Lesson> {
}
