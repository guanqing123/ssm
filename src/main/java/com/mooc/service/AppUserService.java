package com.mooc.service;

import com.mooc.bean.AppUser;
import com.mooc.mapper.AppUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;

    public AppUser getAppUserById(String userid){
        return Optional.ofNullable(appUserMapper.selectByPrimaryKey(userid)).orElse(null);
    }
}
