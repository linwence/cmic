package com.el.cmic.controller;

import com.el.cmic.domain.Emp;
import com.el.cmic.mapper.EmpMapper;
import com.el.cmic.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Vincent on 2016/7/15.
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/api")
    @ResponseBody
    public List<Emp> queryEmp() {
        return empService.queryEmp();
    }

    @RequestMapping("/date1")
    @ResponseBody
    public String date1(Date date1) {
        return date1.toString();
    }

   /* @InitBinder("date1")
    public void initDate(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MMdd"), true));
    }
*/
}
