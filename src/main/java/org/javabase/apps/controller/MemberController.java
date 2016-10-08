package org.javabase.apps.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.javabase.apps.entity.InstallmentRoot;
import org.javabase.apps.entity.Member;
import org.javabase.apps.service.InsRootService;
import org.javabase.apps.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	InsRootService insrootService;
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView installMent(ModelMap m,  ModelAndView mv){
        
		List<InstallmentRoot> insRootList=insrootService.getInstallmentRoots();
        m.put("member", new Member());
        ModelAndView model = new ModelAndView("member");
//        model.addObject("installRootList", insRootList);
        model.addObject("installRootList", insRootList);
        return model;
        
    }
	
	@RequestMapping(value="add",method=RequestMethod.POST)
    public String index(Member member, ModelMap m){
		member.setRoleid(2);
		memberService.addMember(member);
        return "redirect:/member";
    }
   

	@RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }

}
