package org.alex.platform.service;

import org.alex.platform.exception.BusinessException;
import org.alex.platform.pojo.UserDO;
import com.github.pagehelper.PageInfo;


public interface UserService {
    PageInfo<UserDO> findUserList(UserDO userDO, Integer pageNum, Integer pageSize);

    void modifyUser(UserDO userDO) throws BusinessException;

    Boolean saveUser(UserDO userDO);

    UserDO findUserToLogin(UserDO userDO);

    UserDO findUserById(Integer userId);

    void removeUserById(Integer userId);
}
