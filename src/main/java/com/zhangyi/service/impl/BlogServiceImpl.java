package com.zhangyi.service.impl;

import com.zhangyi.entity.Blog;
import com.zhangyi.mapper.BlogMapper;
import com.zhangyi.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangyi
 * @since 2020-06-10
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
