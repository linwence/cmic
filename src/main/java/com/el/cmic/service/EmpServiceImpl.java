package com.el.cmic.service;

import com.el.cmic.domain.Emp;
import com.el.cmic.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vincent on 2016/8/19.
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    public List<Emp> queryEmp() {
        return empMapper.findEmpByAll();
    }
}
