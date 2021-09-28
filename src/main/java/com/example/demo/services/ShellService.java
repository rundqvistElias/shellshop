package com.example.demo.services;

import com.example.demo.entities.Model;
import com.example.demo.entities.Shell;
import com.example.demo.repositories.ShellRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShellService {

    @Autowired
    private ShellRepo shellRepo;

    public List<Shell> getAll() {
        return shellRepo.findAll();
    }

    public List<Shell> getShellByModelName(String phrase) {
        List<Shell> EveryModel;
        List<Shell> returnModel = new ArrayList<>();
        EveryModel = shellRepo.findAll();


        for (Shell s : EveryModel) {
            if (s.getName().toLowerCase().contains(phrase.toLowerCase())) {
                System.out.println(s);
                System.out.println("Model");
                returnModel.add(s);
            }
        }
        return returnModel;

    }

    public Shell createShell(Shell shell) {
        return shellRepo.save(shell);
    }

    public void deleteShell(long id) {
        shellRepo.deleteById(id);
    }

    public void updateById(long id, Shell shell) {
        if (shellRepo.existsById(id)) {
            shell.setId(id);
            shellRepo.save(shell);
        }
    }
}
