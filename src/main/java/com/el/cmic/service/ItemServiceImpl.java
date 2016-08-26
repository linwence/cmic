package com.el.cmic.service;

import com.el.cmic.dev.emp.domain.F4101;
import com.el.cmic.dev.emp.mapper.F4101Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vincent on 2016/7/14.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private F4101Mapper f4101Mapper;
    public List<F4101> findF4101ByAll() {
        return f4101Mapper.findF4101ByAll();
    }
}
