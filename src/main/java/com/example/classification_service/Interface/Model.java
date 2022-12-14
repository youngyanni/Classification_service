package com.example.classification_service.Interface;

import com.example.classification_service.DTO.DataSetDTO;

public interface Model {
    void train(DataSetDTO instances) throws Exception;

}
