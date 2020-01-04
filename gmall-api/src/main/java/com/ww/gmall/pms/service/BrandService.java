package com.ww.gmall.pms.service;

import com.ww.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ww.gmall.vo.PageInfoVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
