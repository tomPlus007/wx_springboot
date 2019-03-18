package com.imooc.weixing.web;

import com.imooc.weixing.entity.Area;
import com.imooc.weixing.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String, Object> listarea() {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Area> list = areaService.selectAreaList();
        result.put("areaList", list);
        return result;
    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(Integer areaId) {
        System.out.println("id:-------------"+areaId);
        Map<String, Object> result = new HashMap<String, Object>();
        Area area = areaService.selectById(areaId);
        result.put("area", area);
        return result;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", areaService.addArea(area));
        return result;
    }

    @RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success",areaService.modifyArea(area));
        return result;

    }

    @RequestMapping(value="/removearea",method = RequestMethod.GET)
    private Map<String,Object> removeArea(Integer id){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",areaService.deleteArea(id));
        return result;
    }




}
