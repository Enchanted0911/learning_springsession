package icu.junyao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author wu
 */
@RestController
public class MyController {
    @RequestMapping("/set")
    public Object set(HttpSession session) {
        session.setAttribute("myKey", "我的session Data");
        return "session set successfully";
    }

    @RequestMapping("/get")
    public Object get(HttpSession session) {
        return (String) session.getAttribute("myKey");
    }
}
