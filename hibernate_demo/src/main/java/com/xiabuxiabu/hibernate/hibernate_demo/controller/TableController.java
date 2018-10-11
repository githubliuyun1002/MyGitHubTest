package com.xiabuxiabu.hibernate.hibernate_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TableController {
   @RequestMapping("login")
   public String login(){
       return "login";
   }
   @RequestMapping("index")
    public String index(HttpServletRequest request){
       String userName=request.getParameter("username");
       String pwd=request.getParameter("pwd");
       String result=null;
       if (userName.equals("admin")&&pwd.equals("admin")){
           result="index";
       }else{
           result="login";
       }
       return result;
    }


}
