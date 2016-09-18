package org.format.demo.controller;

import com.alibaba.fastjson.JSON;
import com.jd.ofc.asyncservice.webservice.ProcessResult;
import com.jd.ofc.asyncservice.webservice.StockSplitOrder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.format.demo.model.Employee;
import org.format.demo.service.IDeptService;
import org.format.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDeptService deptService;

    @RequestMapping
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("employee/list");
        List<Employee> employees = employeeService.list();
        view.addObject("list", employees);
        return view;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/delete/{employeeId}")
    @ResponseBody
    public String delete(@PathVariable Integer employeeId) {
        employeeService.delete(employeeId);
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public ModelAndView add(ModelAndView view) {
        view.setViewName("employee/form");
        view.addObject("depts", deptService.listAll());
        return view;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/detail/{employeeId}")
    public ModelAndView detail(@PathVariable Integer employeeId, ModelAndView view) {
        view.setViewName("employee/form");
        view.addObject("employee", employeeService.getById(employeeId));
        view.addObject("depts", deptService.listAll());
        return view;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update")
    public String add(Employee employee) {
        if(employee.getDept().getId() == null) {
            employee.setDept(null);
        }
        employeeService.saveOrUpdate(employee);
        return "redirect:/employee/";
    }

    @RequestMapping(value = "/test1", method = { RequestMethod.GET,RequestMethod.POST })
    public @ResponseBody String test1() {
        StockSplitOrder sso = new StockSplitOrder();
        sso.setOrderId(42596258876L);
        sso.setUserName("zhangsan");
        Map<String,String> extTags = new HashMap<String,String>();
        extTags.put("stord", "5");
        extTags.put("erp", "6");
        sso.setExtTags(extTags);
        String jsonStr = JSON.toJSONString(sso);
        ProcessResult processResult = deptService.checkStockSplit("split", "split", jsonStr);
        XStream xstream=new XStream(new DomDriver());
        xstream.processAnnotations(processResult.getClass());
        String xmlStr=xstream.toXML(processResult);
        return xmlStr;
    }

    @RequestMapping(value = "/test2", method = { RequestMethod.GET,RequestMethod.POST })
    public @ResponseBody String test2() {
        StockSplitOrder sso = new StockSplitOrder();
        sso.setOrderId(42596258876L);
        sso.setUserName("zhangsan");
        Map<String,String> extTags = new HashMap<String,String>();
        extTags.put("stord", "5");
        extTags.put("erp", "6");
        sso.setExtTags(extTags);
        String jsonStr = JSON.toJSONString(sso);
        ProcessResult processResult = deptService.checkStockSplitJsf("split", "split", jsonStr);
        XStream xstream=new XStream(new DomDriver());
        xstream.processAnnotations(processResult.getClass());
        String xmlStr=xstream.toXML(processResult);
        return xmlStr;
    }
}
