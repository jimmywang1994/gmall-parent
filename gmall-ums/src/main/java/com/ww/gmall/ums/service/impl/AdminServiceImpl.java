package com.ww.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.ums.entity.Admin;
import com.ww.gmall.ums.mapper.AdminMapper;
import com.ww.gmall.ums.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
