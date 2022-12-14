package com.example.classification_service.Enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AlgorithmsENUM {
    J48("J48"), NB("NaiveBayes"), OR("OneR");
    private final String algorithmname;
}
