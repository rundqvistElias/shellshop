package com.example.demo.controller;

import com.example.demo.entities.Model;
import com.example.demo.entities.Shell;
import com.example.demo.services.ShellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/rest")
public class ShellController {
    @Autowired
    private ShellService shellService;

    @GetMapping("/shell")
    public List<Shell> getAllShells(){return shellService.getAll();}

    @GetMapping("/shell/model/{phrase}")
    public List<Shell> getShellByModelSearch(@PathVariable String phrase){return shellService.getShellByModelName(phrase);}



    @PostMapping("/shell/add")
    public Shell createShell(@RequestBody Shell shell) {return shellService.createShell(shell);}

}
