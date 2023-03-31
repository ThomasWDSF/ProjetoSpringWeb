package com.web.tornese.SpringWeb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.tornese.SpringWeb.models.Administrador;
import com.web.tornese.SpringWeb.repositorio.AdministradoresRepo;


@Controller
public class AdmController {

    @Autowired
    private AdministradoresRepo repo;

    @GetMapping("/admin")
    public String index(Model model){


        List<Administrador> administradores = (List<Administrador>)repo.findAll();



        model.addAttribute("administradores", administradores);


        return "admin/index";
    }

    @GetMapping("/admin/novo")
    public String novo(){
        return "admin/novo";
    }

    @PostMapping("/admin/criar")
    public String criar(Administrador administrador){
        repo.save(administrador);
        return "redirect:/admin";
    }

    @GetMapping("admin/{id}")
    public String busca(@PathVariable int id, Model model){
        Optional<Administrador> admin = repo.findById(id);
        model.addAttribute("administrador", admin);
        return "admin/editar";
    }

    @GetMapping("/admin/{id}/excluir")
    public String excluir(@PathVariable int id){
        repo.deleteById(id);
        return "redirect:/admin";
    }
}
