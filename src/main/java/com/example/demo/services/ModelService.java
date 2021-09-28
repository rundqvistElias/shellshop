package com.example.demo.services;

import com.example.demo.entities.Brand;
import com.example.demo.entities.Model;
import com.example.demo.entities.Shell;
import com.example.demo.repositories.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModelService {

    @Autowired
    private ModelRepo modelRepo;

        public List<Model> getAll() {
        return modelRepo.findAll();
    }




    public List<Model> findModelById(long modelId) {
        return modelRepo.findById(modelId);
    }

    public List<Model> findModelByBrandId(long brandId) {
        return modelRepo.findByBrandId(brandId);
    }

    public List<Model> getModelByShellDimension(int dim) {return modelRepo.findByDimension(dim);}

    public List<Model> findModelByPhrase(String phrase) {
        List<Model> EveryModel;
        List<Model> returnModel = new ArrayList<>();
        EveryModel = modelRepo.findAll();


        for (Model mod : EveryModel) {
            if (mod.getName().toLowerCase().contains(phrase.toLowerCase())) {
                returnModel.add(mod);
            }
        }
        return returnModel;

    }

    public Model createModel(Model model) {
        return modelRepo.save(model);
    }

    public void deleteModel(long id) {
        modelRepo.deleteById(id);
    }

    public void updateById(long id, Model model) {
        if (modelRepo.existsById(id)) {
            model.setId(id);
            modelRepo.save(model);
        }


    }
}
