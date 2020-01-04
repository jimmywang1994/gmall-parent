package com.ww.gmall.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.ums.entity.Admin;
import com.ww.gmall.ums.mapper.AdminMapper;
import com.ww.gmall.ums.service.AdminService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Component
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        //Spring自带的md5工具类
        String digest = DigestUtils.md5DigestAsHex(password.getBytes());

        AdminMapper baseMapper = getBaseMapper();

        Admin admin = baseMapper.selectOne(new QueryWrapper<Admin>()
                .eq("username", username)
                .eq("password", digest));
        return admin;
    }

    /**
     * 获取用户详情
     * @param userName
     * @return
     */
    @Override
    public Admin getUserInfo(String userName) {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("userName",userName));
    }
}
