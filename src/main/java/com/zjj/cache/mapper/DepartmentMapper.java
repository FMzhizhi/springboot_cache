package com.zjj.cache.mapper;

import com.zjj.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/7/16 23:21
 */
@Mapper
public interface DepartmentMapper {
    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);
}
