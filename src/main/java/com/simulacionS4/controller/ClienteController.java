package com.simulacionS4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.simulacionS4.dao.IClienteDAO;

@Controller
@CrossOrigin(origins = { "http://localhost:4200" })
public class ClienteController {

	@Autowired
	private IClienteDAO iClienteDAO;
}
