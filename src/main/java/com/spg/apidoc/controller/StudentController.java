package com.spg.apidoc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spg.apidoc.vo.BaseResultVo;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * 项目名称：apidoc
 *
 * @description:
 * @author Wind-spg
 * @create_time：2015年2月10日 下午2:11:40
 * @version V1.0.0
 *
 */
@Controller
public class StudentController extends BaseController
{
    private static final Log LOGGER = LogFactory.getLog(StudentController.class);

    @RequestMapping(value = "updateStudent", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ApiOperation(value = "修改学生信息", httpMethod = "POST", notes = "学生信息以json格式传递", response = BaseResultVo.class)
    public @ResponseBody String updateStudent(@ApiParam(required = true) @RequestParam String postData)
    {
        LOGGER.debug(String.format("enter function, %s", postData));
        return buildSuccessResultInfo(1);
    }
    
//    @RequestMapping(value = "addStudent", produces = "application/json; charset=utf-8")
//    @ApiOperation(value = "新增学生信息", httpMethod = "GET", notes = "学生信息以json格式传递", response = BaseResultVo.class)
//    public @ResponseBody String addStudent(@ApiParam(required = true) @RequestParam String postData)
//    {
//        LOGGER.debug(String.format("enter function, %s", postData));
//        return buildSuccessResultInfo("add student success");
//    }
//    
    @RequestMapping(value = "deleteStudent", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "删除学生信息", httpMethod = "GET", notes = "学生信息以json格式传递", response = BaseResultVo.class)
    public @ResponseBody String deleteStudent(@ApiParam(required = true) @RequestParam String postData)
    {
        LOGGER.debug(String.format("enter function, %s", postData));
        return buildSuccessResultInfo("delete student success");
    }

}
