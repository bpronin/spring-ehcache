package com.bo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Class Service.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
@Controller
public class ServiceController {

    @Resource(name = "service")
    private Service service;

    @RequestMapping("/report")
    @ResponseBody
    public String getReport() {
        return service.getReport();
    }
}
