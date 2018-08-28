package com.test.wdd.domain.dao;

import com.test.wdd.domain.entry.GroupResources;
import com.test.wdd.domain.entry.GroupResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupResourcesMapper {
    int countByExample(GroupResourcesExample example);

    int deleteByExample(GroupResourcesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupResources record);

    int insertSelective(GroupResources record);

    List<GroupResources> selectByExample(GroupResourcesExample example);

    GroupResources selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupResources record, @Param("example") GroupResourcesExample example);

    int updateByExample(@Param("record") GroupResources record, @Param("example") GroupResourcesExample example);

    int updateByPrimaryKeySelective(GroupResources record);

    int updateByPrimaryKey(GroupResources record);
}