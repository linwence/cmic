package com.el.cmic.dev.emp.controller;

import com.el.cmic.dev.emp.domain.Emp;
import com.el.cmic.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Vincent on 2016/7/15.
 */
@Controller
@RequestMapping("/api/emp")
public class EmpController {
    Logger logger = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List<Emp> queryEmp() {
        logger.info("..........s..............");
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
    }*/

    @RequestMapping("/map")
    @ResponseBody
    public String map(MapForm mapForm) {
        return mapForm.toString();
    }

    @RequestMapping("/map2")
    @ResponseBody
    public String map(Map<String, Object> mapForm) {
        return mapForm.toString();
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(ListForm listForm) {
        return listForm.toString();
    }


}
