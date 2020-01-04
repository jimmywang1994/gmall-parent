package com.ww.gmall.ums.service;

import com.ww.gmall.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
public interface AdminService extends IService<Admin> {
     Admin login(String username, String password);

    Admin getUserInfo(String userName);
}
