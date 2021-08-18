package com.works.Repostories.PostgresRepostories;

import com.works.Model.PostgresEntity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepostory extends JpaRepository<City, Integer> {
}
