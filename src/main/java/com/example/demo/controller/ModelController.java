package com.example.demo.controller;


import com.example.demo.entities.Model;
import com.example.demo.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping("/model")
    public List<Model> getAllModels(){return modelService.getAll();}

    @GetMapping("/model/{modelId}")
    public List<Model> getModelsById(@PathVariable long modelId){return modelService.findModelById(modelId);}

    @GetMapping("/model/search/{phrase}")
    public List<Model> getModelsBySearch(@PathVariable String phrase){return modelService.findModelByPhrase(phrase);}

    @GetMapping("/model/brand/{brandId}")
    public List<Model> getModelsByBrandId(@PathVariable long brandId){return modelService.findModelByBrandId(brandId);}

    @PostMapping("/model/add")
    public Model createModel(@RequestBody Model model) {return modelService.createModel(model);}

    @DeleteMapping("/model/{modelId}")
    public void deleteModel(@PathVariable long id) {modelService.deleteModel(id);}

    @PutMapping("model/{modelId}")
    public void updateModel(@PathVariable long id, @RequestBody Model model) {modelService.updateById(id, model);}

    @GetMapping("model/shell/dimension/{dim}")
    public List<Model> getModelByShellDim(@PathVariable int dim){return modelService.getModelByShellDimension(dim);}
}
