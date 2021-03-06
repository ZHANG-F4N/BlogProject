package com.f4n.blog.service;

import com.f4n.blog.dao.pojo.SysUser;
import com.f4n.blog.vo.Result;
import com.f4n.blog.vo.UserVo;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long authorId);
}
