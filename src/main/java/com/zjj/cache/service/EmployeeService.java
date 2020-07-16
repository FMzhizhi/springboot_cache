package com.zjj.cache.service;

import com.zjj.cache.bean.Employee;
import com.zjj.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/7/16 23:35
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper mapper;

    public Employee getEmp(Integer id){
        return mapper.getEmpById(id);
    }
}
