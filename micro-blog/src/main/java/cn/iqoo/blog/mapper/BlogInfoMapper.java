package cn.iqoo.blog.mapper;

import cn.iqoo.blog.entity.BlogInfo;
import java.util.List;

public interface BlogInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogInfo record);

    BlogInfo selectByPrimaryKey(Integer id);

    List<BlogInfo> selectAll();

    int updateByPrimaryKey(BlogInfo record);
}