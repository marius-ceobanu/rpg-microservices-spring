package com.codecool.rpggame.controller;

import com.codecool.rpggame.service.RpgGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpgGameController {

    @Autowired
    private RpgGame rpgGame;

    @GetMapping("/fight")
    public String fight() {
        return rpgGame.evaluateCombat();
    }
}
