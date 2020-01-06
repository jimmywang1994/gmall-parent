package com.ww.gmall.pms.service.impl;

import com.ww.gmall.pms.entity.Comment;
import com.ww.gmall.pms.mapper.CommentMapper;
import com.ww.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2020-01-06
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
