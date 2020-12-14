package com.costa.crud.disciplina.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.costa.crud.disciplina.dao.DisciplinaDAO;
import com.costa.crud.disciplina.dominio.Disciplina;

import java.util.List;

@Controller
public class DisciplinaControle {

	@Autowired
	DisciplinaDAO dao;

	@GetMapping("/disciplinas")
	public String disciplinasTabela(Model modelo) {
		List<Disciplina> lista = dao.todos();
		modelo.addAttribute("lista", lista);
		return "disciplinas";
	}
}