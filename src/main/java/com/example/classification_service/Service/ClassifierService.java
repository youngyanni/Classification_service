package com.example.classification_service.Service;

import com.example.classification_service.DTO.Instances;
import com.example.classification_service.DTO.Optionss;
import com.example.classification_service.Enums.Algorithms;
import com.example.classification_service.classifiers.J48Test;
import com.example.classification_service.classifiers.NaiveBayes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClassifierService {
    public void putModel(Instances instances, Optionss options, Algorithms alg){
        String name = String.valueOf(alg);
        switch (name){
            case("J48"):
                return J48Test.Test(instances, options);
                break;
            case ("NaiveBayes"):
                return NaiveBayes.Test(instances, options);
                break;
            case ("OneR"):
                return OneR.Test(instances, options);
                break;
        }
    }
}
