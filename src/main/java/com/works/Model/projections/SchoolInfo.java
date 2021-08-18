package com.works.Model.projections;

import com.works.Model.PostgresEntity.School;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface SchoolInfo {


    int getId();

    @Value("#{@utilBeans.lessonName(target.id)}")
    String getLessonname();

    String getSchoolCode();

    String getSchoolname();

    CityInfo getCity();

    interface CityInfo {
        String getCityName();

        List<School> getSchools();
    }



}
