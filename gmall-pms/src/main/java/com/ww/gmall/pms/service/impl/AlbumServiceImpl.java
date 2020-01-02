package com.ww.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.pms.entity.Album;
import com.ww.gmall.pms.mapper.AlbumMapper;
import com.ww.gmall.pms.service.AlbumService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Component
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
