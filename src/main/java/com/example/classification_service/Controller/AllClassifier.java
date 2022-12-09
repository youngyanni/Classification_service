package com.example.classification_service.Controller;

import com.example.classification_service.DTO.Instances;
import com.example.classification_service.DTO.Optionss;
import com.example.classification_service.Enums.Algorithms;
import com.example.classification_service.Service.ClassifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
@RequiredArgsConstructor
public class AllClassifier {
    private final ClassifierService service;

     /*1) Endpoint Список доступных алгоритмов
    GET /algorithms
    Без параметров
    2) Endpoint Создания новой модели
    POST /model
    В теле запроса параметры для создания модели*/
    @PostMapping(value = "/model")
    public void CreateModel(@RequestBody Instances instances, Optionss options, Algorithms alg){
        service.putModel(instances,options,alg);
}
}
