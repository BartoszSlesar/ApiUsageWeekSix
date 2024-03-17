package com.bard.apiusageweeksix.controllers;


import com.bard.apiusageweeksix.services.SpellService;
import com.bard.apiusageweeksix.config.ApiConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomePage {


    private final SpellService spellService;


    @RequestMapping({"", "/", "index", "index.html"})
    public String index(Model model) {

        model.addAttribute("spells", this.spellService.getAllSpells());
//        TODO Ogarnąć paginacje
        return "index";
    }
}
