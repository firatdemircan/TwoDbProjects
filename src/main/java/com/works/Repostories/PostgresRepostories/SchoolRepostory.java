package com.works.Repostories.PostgresRepostories;

import com.works.Entity.PostgresEntity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepostory extends JpaRepository<Integer, School> {
}
