package com.lauracristina.redballoon.controller;

import com.lauracristina.redballoon.model.Aluno;
import com.lauracristina.redballoon.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AlunosController {

    @Autowired
    AlunoRepository repository;

    @GetMapping("/alunos")
    public String exibeAlunos(Model model) {
        List<Aluno> list = repository.buscaTodos();
        model.addAttribute("alunos", list);
        return "alunos/listar";
    }

    @GetMapping("/alunos/dados")
    public String exibeDados(@RequestParam(name = "id", required = false) Integer cod, Model modelo) {
        Aluno aluno = repository.buscaPorId(cod);
        modelo.addAttribute("aluno", repository.buscaPorId(cod));
        return "alunos/dados";
    }

    @PostMapping(value = "/alunos/dados")
    public String processaForm(Aluno aluno) {
        if (aluno.getId() == 0) {
            repository.salvar(aluno);
        } else {
            repository.atualizar(aluno);
        }
        return "redirect:/alunos";
    }

    @GetMapping(value = "/alunos/dados/excluir")
    public String excluir(@RequestParam(name = "id", required = true) Integer cod) {
        repository.excluir(cod);
        return "redirect:/alunos";
    }
}
