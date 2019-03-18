package com.imooc.weixing.dao;

import com.imooc.weixing.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area>  areaList = areaDao.queryArea();
        System.out.println(areaList.get(0).getAreaName());
        assertEquals(2,areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        System.out.println(area.getAreaName());


    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("文忠苑");
        area.setPriority(5);
        int effectedNum = areaDao.insertArea(area);
        assertEquals(effectedNum,1);
        System.out.println(effectedNum);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setPriority(5);
        area.setAreaName("西苑");
        area.setAreaId(3);
        areaDao.updateArea(area);
    }

    @Test
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(5);
        assertEquals(effectedNum,1);
    }
}