package com.example.RIS.controller;

import com.example.RIS.model.Informe;
import com.example.RIS.service.InformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/informes")
public class InformeController {

    @Autowired
    private InformeService informeService;

    @GetMapping
    public String listarInformes(Model model) {
        model.addAttribute("informes", informeService.listarInformes());
        return "listarInformes"; // Nombre del archivo HTML
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("informe", new Informe());
        return "formularioInforme"; // Nombre del archivo HTML
    }

    @PostMapping
    public String guardarInforme(@ModelAttribute Informe informe) {
        informeService.guardarInforme(informe);
        return "redirect:/informes"; // Redirigir después de guardar
    }
}
