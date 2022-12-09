package com.example.classification_service.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Optionss {
    @JsonProperty(value = "flags")
    private ArrayList<String> option;


    public String[] toArray(String[] strings) {
        return strings;
    }

    public int size() {
        return 0;
    }
}
