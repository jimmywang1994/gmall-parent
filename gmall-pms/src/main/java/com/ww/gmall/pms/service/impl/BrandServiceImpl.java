package com.ww.gmall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.pms.entity.Brand;
import com.ww.gmall.pms.mapper.BrandMapper;
import com.ww.gmall.pms.service.BrandService;
import com.ww.gmall.vo.PageInfoVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    BrandMapper brandMapper;
    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> wrapper=new QueryWrapper<>();
        if(!StringUtils.isEmpty(keyword)){
            wrapper.like("name",keyword);
        }
        IPage<Brand> brandPage = brandMapper.selectPage(new Page<Brand>(pageNum.longValue(), pageSize.longValue()), wrapper);
        PageInfoVo brandPageInfo=new PageInfoVo(brandPage.getTotal(), brandPage.getPages(), brandPage.getSize(), brandPage.getRecords(), brandPage.getCurrent());
        return brandPageInfo;
    }
}
