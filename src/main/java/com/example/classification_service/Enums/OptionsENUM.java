package com.example.classification_service.Enums;


import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum OptionsENUM {
    USE_UNPRUNED_TREE("-U"),
    PRUNING_CONFIDENCE_THRESHOLD("-S"),
    MINIMUM_INSTANCES_PER_LEAF("-M"),
    REDUCED_ERROR_PRUNING("-R"),
    NUMBER_OF_FOLDS_FOR_REDUCED_ERROR_PRUNING("-N"),
    BINARY_SPLITS_ONLY("-B"),
    NO_SUBTREE_RAISING("-S"),
    NO_CLEAN_UP_AFTER_TREE_BUILDING("-L"),
    LAPLACE_SMOOTHING("-A"),
    RANDOM_NUMBER_SEED("-Q");
    private final String param;
}
