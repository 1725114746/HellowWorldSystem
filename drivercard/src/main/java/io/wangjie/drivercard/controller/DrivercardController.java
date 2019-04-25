package io.wangjie.drivercard.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.wangjie.drivercard.dao.DrivercardMapper;
import io.wangjie.drivercard.dto.DrivercardDTO;
import io.wangjie.drivercard.pojo.Drivercard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/drivercard")
@EnableAutoConfiguration
@CrossOrigin
public class DrivercardController {

    @Autowired
    private DrivercardMapper drivercardMapper;

    @GetMapping("/getWithPageAndName")
    public PageInfo<Drivercard> getWithPageAndName(@RequestParam(required = false,defaultValue = "1") Integer pageNum,@RequestParam(required = false,defaultValue = "") String cardname){
        PageHelper.startPage(pageNum,3);
        Page<Drivercard> drivercards = drivercardMapper.selectWithPageAndName(cardname);
        PageInfo<Drivercard> drivercardPageInfo = drivercards.toPageInfo();
        return drivercardPageInfo;
    };

    @GetMapping("/getById")
    public Drivercard getById(@RequestParam Integer cardId){
        Drivercard drivercard = drivercardMapper.selectByPrimaryKey(cardId);
        return drivercard;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody DrivercardDTO drivercardDTO){
        Drivercard drivercard = new Drivercard();
        drivercard.setCarnum(drivercardDTO.getCarnum());
        drivercard.setCardname(drivercardDTO.getCardname());
        drivercard.setSex(drivercardDTO.getSex());
        drivercard.setCityId(drivercardDTO.getCityId());
        drivercard.setRoleId(drivercardDTO.getRoleId());
        drivercard.setDate(drivercardDTO.getDate());
        //MD5+盐
        String salt = UUID.randomUUID().toString();
        drivercard.setSalt(salt);
        String passwordToEncrypt = drivercardDTO.getPass()+salt;
        String encryptedPassword = DigestUtils.md5DigestAsHex(passwordToEncrypt.getBytes());
        drivercard.setPassword(encryptedPassword);
        drivercardMapper.insert(drivercard);
        Integer cardId = drivercard.getCardId();
        return cardId;
    }

    @PostMapping("/update")
    public void update(@RequestBody Drivercard drivercard){
        drivercardMapper.updateByPrimaryKey(drivercard);
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody Drivercard drivercard){
        Integer cardId = drivercard.getCardId();
        drivercardMapper.deleteByPrimaryKey(cardId);
        return true;
    }

}
