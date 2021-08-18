package com.works.service;

import com.works.Model.enums.EResult;
import com.works.Model.projections.SchoolInfo;
import com.works.Repostories.PostgresRepostories.SchoolRepostory;
import com.works.utils.result.Result;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    private final SchoolRepostory schoolRepostory;


    public SchoolService(SchoolRepostory schoolRepostory) {
        this.schoolRepostory = schoolRepostory;
    }

    public Result<SchoolInfo> getSchool(int id){
        return new Result<SchoolInfo>(EResult.success,"Kayıt Yapıldı",schoolRepostory.findProjectedById(SchoolInfo.class,2));
    }

}
