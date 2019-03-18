package com.imooc.weixing.service;

import com.imooc.weixing.entity.Area;

import java.util.List;

public interface AreaService {

    List<Area> selectAreaList();
    Area selectById(Integer id);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(Integer id);



}
