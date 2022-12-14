package com.example.classification_service.Controller;

import com.example.classification_service.DTO.DataSetDTO;
import com.example.classification_service.DTO.OptionsDTO;
import com.example.classification_service.Enums.AlgorithmsENUM;
import com.example.classification_service.Service.ClassifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("message")
@RequiredArgsConstructor
public class ClassifiersController {
    private final ClassifierService service;
    @GetMapping(value = "/model")
    public void CreateModel(@RequestBody OptionsDTO options, @RequestBody AlgorithmsENUM alg, @RequestBody DataSetDTO instances) throws Exception {
        service.putModel(options, alg, instances);
    }

}
