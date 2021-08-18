package com.works.test;


import com.works.service.SchoolService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@Component
@RestController
public class TestComponent {

    private final SchoolService schoolService;

    public TestComponent(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostConstruct
    public void test(){
        System.out.println(schoolService.getSchool(2));

        int x;
        x=2;
    }

}
