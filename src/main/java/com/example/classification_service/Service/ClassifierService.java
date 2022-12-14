package com.example.classification_service.Service;

import com.example.classification_service.DTO.DataSetDTO;
import com.example.classification_service.DTO.OptionsDTO;
import com.example.classification_service.Enums.AlgorithmsENUM;
import com.example.classification_service.classifiers.J48Impl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClassifierService {
    public void putModel(OptionsDTO options, AlgorithmsENUM alg, DataSetDTO inst) throws Exception {
        J48Impl J48 = new J48Impl(options);
        J48.train(inst);
    }
}
