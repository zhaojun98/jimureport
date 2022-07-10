package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.ReportModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportMapper extends BaseMapper<ReportModel> {

    @Select("select id, name, create_by, create_time, update_by, update_time from jimu_report where template = 0 and del_flag = 0" +
            " and id not in ('961455b47c0b86dc961e90b5893bff05', '570128838205493248', '575163965000249344', 'f5f275b5e28b45256ef24587ec792f0c', '1cd9d574d0c42f3915046dc61d9f33bd', '9dbadaee8720767efe3164a7d018c870', 'ff9bd143582a6dfed897ba8b6f93b175', '961455b47c0b86dc961e90b5893bff05')")
    public List<ReportModel> selectIdAndName();
}
