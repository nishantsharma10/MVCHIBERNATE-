package myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import myproject.model.User;
import myproject.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	@RequestMapping(value = {"/","/home" }, method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@GetMapping(value = "/registerme")
	public String processRegisterMe(Model model) {
		model.addAttribute("user", new User());
		return "registerMe";
	}

	@PostMapping(value = "/registerme")
	public String processRegisterMeForm(@ModelAttribute("user") User user, BindingResult result) {
		userService.saveUser(user);
		return "home";
	}

	@RequestMapping(value = { "/loginhtml" }, method = RequestMethod.GET)
	// @GetMapping(value = "/loginhtml")
	public String processLoginHtmlPage(Model model) {
		return "loginHTML";
	}

	@RequestMapping(value = { "/loginhtml" }, method = RequestMethod.POST)
	// @PostMapping(value = "/loginhtml")
	public String processLoginHtmlCredentials(@RequestParam(value = "userId", defaultValue = "0") String userId,
			HttpServletRequest req, Model model) {

		String pwd = req.getParameter("password");
		System.out.println("User Id = " + userId);
		System.out.println("Password = " + pwd);

		User usr = new User();
		usr.setUserId(Integer.parseInt(userId));
		usr.setPassword(pwd);

		if (userService.findUser(usr)) {
			model.addAttribute("userInSession", userId);
			return "adminHome";
		}

		return "loginHTML";
	}

	@GetMapping(value = "/loginspring")
	public String processLoginSpringPage(Model model) {
		model.addAttribute("user", new User());
		return "loginspring";
	}

	@PostMapping(value = "/loginspring")
	public String processLoginSpringCredentials(User user12, BindingResult result) {
		User usr = userService.findById(user12.getUserId());

		if (usr != null) {
			return "redirect:/" + usr.getUserId();
		}

		user12.setUserId(100);
		return "loginspring";
	}

	@GetMapping(value = "/{userId}")
	public String processAdminHome(@PathVariable String userId, Model model, HttpSession session) {
		User usr = userService.findById(Integer.parseInt(userId));

		model.addAttribute("user", usr);

		return "adminHome";
	}

	@GetMapping(value = "/logout")
	public String processLogout() {
		return "logout";
	}
	}