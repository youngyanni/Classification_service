package com.example.classification_service.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import weka.core.Attribute;

import java.util.ArrayList;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSetDTO {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "attributeName")
    private ArrayList<Attribute> attributeName;
    @JsonProperty(value = "capacity")
    private int capacity;
}