package com.imooc.weixing.dao;

import com.imooc.weixing.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(Integer areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
