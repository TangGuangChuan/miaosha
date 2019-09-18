package com.miaoshaproject.service;

import com.miaoshaproject.dataobject.UserDO;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);
}
