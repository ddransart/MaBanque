package org.sid.maBanque.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	// Page de connexion
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	// HomePage
	@RequestMapping(value = "/")
	public String home() {
		return "redirect:/user/operations";
	}

	// Accès interdit
	@RequestMapping(value = "/403")
	public String accessDenied() {
		return "403";
	}
}
