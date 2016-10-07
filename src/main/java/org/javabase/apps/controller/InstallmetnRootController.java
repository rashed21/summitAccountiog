package org.javabase.apps.controller;

import java.util.List;

import org.javabase.apps.entity.InstallmentRoot;
import org.javabase.apps.service.InsRootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/installRoot")
public class InstallmetnRootController {
	
	@Autowired
	InsRootService insrootservice;
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView installMent(ModelMap m,  ModelAndView mv){
        
		List<InstallmentRoot> insRootList=insrootservice.getInstallmentRoots();
        m.put("installRoot", new InstallmentRoot());
        ModelAndView model = new ModelAndView("installRoot");
        model.addObject("installRootList", insRootList);
        return model;
        
    }
	
	   @RequestMapping(value="addInsRoot",method=RequestMethod.POST)
	    public String index(InstallmentRoot installRoot, ModelMap m){
		   insrootservice.addInsRoot(installRoot);
	        
	        return "redirect:/installRoot";
	    }
	   
	   
	/*   
	   List<ProductColor> productColorList=productColorService.selectProductColor();
       m.put("color", new ProductColor());
       ModelAndView model = new ModelAndView("productColor");
       model.addObject("colorList", productColorList);*/
/*	@ResponseBody
	@RequestMapping(value="/addInstallRoot", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody InstallmentRoot installmentRoot) {
		Map<String, Object> response= new HashMap<String, Object>();
        
		insrootservice.addInsRoot(installmentRoot);
		response.put("suceess", true);
        response.put("message", "Registration Sucess");
		return response;
	}*/

/*	@RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }*/

}
