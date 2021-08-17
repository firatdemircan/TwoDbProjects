package com.works.Repostories.PostgresRepostories;

import com.works.Entity.PostgresEntity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepostory extends JpaRepository<Integer, City> {
}
