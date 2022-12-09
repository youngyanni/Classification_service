package com.example.classification_service.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instances {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "attributeName")
    private List<String> attributeName;
    @JsonProperty(value = "capacity")
    private int capacity;
}
