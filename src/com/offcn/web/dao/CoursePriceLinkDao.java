package com.offcn.web.dao;

import com.offcn.common.domain.course.CoursePriceLink;
import com.offcn.common.domain.course.CoursePriceLinkQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursePriceLinkDao {
    int countByExample(CoursePriceLinkQuery example);

    int deleteByExample(CoursePriceLinkQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoursePriceLink record);

    int insertSelective(CoursePriceLink record);

    List<CoursePriceLink> selectByExample(CoursePriceLinkQuery example);

    CoursePriceLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoursePriceLink record, @Param("example") CoursePriceLinkQuery example);

    int updateByExample(@Param("record") CoursePriceLink record, @Param("example") CoursePriceLinkQuery example);

    int updateByPrimaryKeySelective(CoursePriceLink record);

    int updateByPrimaryKey(CoursePriceLink record);
}