package com.zw.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zw.annotation.Controller;
import com.zw.annotation.Qualifier;
import com.zw.annotation.RequestMapping;
import com.zw.annotation.RequestParam;
import com.zw.service.UserService;

@Controller
@RequestMapping("/zw")
public class ZwController {
	
	@Qualifier("UserServiceImpl")
	private UserService userService;
	
	@RequestMapping("/query")
	public void query(HttpServletRequest request, HttpServletResponse response, 
			@RequestParam("name") String name, @RequestParam("age") String age) {
		PrintWriter pw;
		try {
			pw = response.getWriter();
			String ret = userService.query(name, age);
			pw.write(ret);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/insert")
	public void insert(HttpServletRequest request, HttpServletResponse response) {
		try {
            PrintWriter pw = response.getWriter();
            String result = userService.insert("0000");
            
            pw.write(result);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	@RequestMapping("/update")
	public void udpate(HttpServletRequest request, HttpServletResponse response, String param) {
		try {
            PrintWriter pw = response.getWriter();
            String result = userService.update(param);
            
            pw.write(result);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
