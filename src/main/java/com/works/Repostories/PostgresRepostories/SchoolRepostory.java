package com.works.Repostories.PostgresRepostories;

import com.works.Model.PostgresEntity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepostory extends JpaRepository<School, Integer> {
    <T> T findProjectedById(Class<T> t,int id);
}
