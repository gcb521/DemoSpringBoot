package com.example.demo.service;

import com.example.demo.entity.UserVO;
import com.example.demo.service.impl.indexService;
import org.springframework.stereotype.Service;

@Service
class indexServiceImpl implements indexService {

    @Override
    public boolean indexCheck(UserVO userVO){
        if(userVO.getUserName()=="taro@123" && userVO.getPassWord()=="123123"){
            return true;
        }else {
            return false;
        }
    }
}
