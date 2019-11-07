package com.spiders.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spiders.app.config.Constants;
import com.spiders.app.dto.UserDto;
import com.spiders.app.service.UserServiceI;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceI userService;
	
	@RequestMapping(value ="/createtask" ,method= RequestMethod.POST)
	String createtask( @Valid UserDto user , BindingResult result ,Model model){
		
		if(result.hasErrors()) {
			
			System.out.println("has error");
			List<FieldError> allErrors = result.getFieldErrors();
			
			for (FieldError error : allErrors) 	
				//logic
				System.out.println("error -- > " + error.getDefaultMessage());
				FieldError error1 = null;
				model.addAttribute(error1.getField(), error1.getDefaultMessage());
		
		}
		return null;}
		
		/*else {
			
			user.setRole(Constants.USER_ROLE);
			System.out.println(user);
			long id = (long)userService.saveUser(user);
			if(id > 0) {
				List<UserDto> allUsers = userService.findAllUserByAdminId(user.getAdminId());
				if (!allUsers.isEmpty()) {
					model.addAttribute("data", allUsers);
					model.addAttribute("adminId", user.getAdminId());
				}
				System.out.println(allUsers);
				
				return "showAllUser";
			}
		
		}
		
		return "AddUser";*/
	
		
	@RequestMapping(value = "/getGetalltask" , method= RequestMethod.GET) 
	ModelAndView getDetails(){
		System.out.println("----------------------[");
		System.out.println("inside method ");
		
		return new ModelAndView("");
	}
	
	/*@GetMapping("/gotoDashBoard")
	public String  viewUserDashBoard() {
		
		return "UserDashBoard";
	}
	
	
	@GetMapping("/viewUserProfile")
	public String  viewUserProfilePage() {
		return "ViewUserDetails";
	}*/

	
	@GetMapping("/viewDeletePage")
	public String  viewDeleteProfilePage() {
		
		return "deteletask";
	}
	
	
	@GetMapping("/deleteUserProfile")
	public String  deleteUserProfile(@RequestParam(value= "option") String option) {
		System.out.println("object delete");
		
		System.out.println(option);
		
		return "index";
	}
	
	@GetMapping("/viewUpdatePage")
	public String  viewUserUpdatePage() {
		return "updateUserPage";
	}
	
	@PostMapping("/updateUserDetails")
	public String  updatetask( UserDto dto) {
		System.out.println(dto);
		
	
		return "UserDashBoard";
	}	
	
}
