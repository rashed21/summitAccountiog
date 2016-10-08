package org.javabase.apps.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.javabase.apps.entity.InstallmentRoot;
import org.javabase.apps.entity.Member;
import org.javabase.apps.entity.Savings;
import org.javabase.apps.service.InsRootService;
import org.javabase.apps.service.MemberService;
import org.javabase.apps.service.SavingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/savings")
public class SavingsController {
	
	@Autowired
	SavingsService savingsService;
	
	@Autowired 
	MemberService memberService;
    private String contact;
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView memberView(Savings savings, ModelMap m,  ModelAndView mv){
		Member member=memberService.getMemberByMemberContact(contact);
        m.put("savings", new Savings());
        m.put("member", member);
        ModelAndView model = new ModelAndView("savings");
        return model;
    }
	
	
	
	@RequestMapping(value="member",method=RequestMethod.POST)
    public String member(Savings savings, ModelMap m){
		contact=savings.getContact();
        return "redirect:/savings";
    }
	
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String addMember(Savings savings, ModelMap m){
		savingsService.addSavings(savings);
		return "redirect:/savings";
	}
}
