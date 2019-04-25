package io.wangjie.drivercard.controller;

import io.wangjie.drivercard.dao.CityMapper;
import io.wangjie.drivercard.vo.CityNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin
public class CityController {

    @Autowired
    private CityMapper cityMapper;

    @GetMapping("/getCityTreeById")
    public List<CityNode> getCityTreeById(Integer cityId){
        List<CityNode> cityNodes = cityMapper.selectChildren(cityId);
        return cityNodes;
    }
}
