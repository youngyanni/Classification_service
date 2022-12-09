package com.example.classification_service.classifiers;

import com.example.classification_service.DTO.Instances;
import com.example.classification_service.DTO.Optionss;
import com.example.classification_service.Interface.GeneralInterface;
import org.springframework.beans.factory.annotation.Autowired;
import weka.classifiers.trees.J48;

import java.util.ArrayList;


public class J48Test implements GeneralInterface {
    @Autowired
    public void Test(Instances instances, Optionss option) throws Exception {

        J48 J48 = new J48();
        J48.setOptions(option.toArray(new String[option.size()]));
        J48.buildClassifier(instances);

    }



}
