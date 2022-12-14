package com.example.classification_service.classifiers;

import com.example.classification_service.DTO.DataSetDTO;
import com.example.classification_service.DTO.OptionsDTO;
import com.example.classification_service.Enums.OptionsENUM;
import com.example.classification_service.Interface.Model;
import weka.classifiers.trees.J48;
import weka.core.Instances;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class J48Impl implements Model {
    private final J48 j48;

    public J48Impl(OptionsDTO option) throws Exception{
        this.j48 = new J48();
        Map<String, String> values = option.getOption();
        List<String> options = new ArrayList<String>();
        if (values.containsKey(OptionsENUM.USE_UNPRUNED_TREE)){
            options.add("-U");
        }
        if (values.containsKey(OptionsENUM.PRUNING_CONFIDENCE_THRESHOLD)){
            options.add("-C");
            options.add(values.get(OptionsENUM.PRUNING_CONFIDENCE_THRESHOLD));
        }
        if (values.containsKey(OptionsENUM.MINIMUM_INSTANCES_PER_LEAF)){
            options.add("-M");
            options.add(values.get(OptionsENUM.MINIMUM_INSTANCES_PER_LEAF));
        }
        if (values.containsKey(OptionsENUM.REDUCED_ERROR_PRUNING)){
            options.add("-R");
        }
        if (values.containsKey(OptionsENUM.NUMBER_OF_FOLDS_FOR_REDUCED_ERROR_PRUNING)){
            options.add("-N");
            options.add(values.get(OptionsENUM.NUMBER_OF_FOLDS_FOR_REDUCED_ERROR_PRUNING));
        }
        if (values.containsKey(OptionsENUM.BINARY_SPLITS_ONLY)){
            options.add("-B");
        }
        if (values.containsKey(OptionsENUM.NO_SUBTREE_RAISING)){
            options.add("-S");
        }
        if (values.containsKey(OptionsENUM.NO_CLEAN_UP_AFTER_TREE_BUILDING)){
            options.add("-L");
        }
        if (values.containsKey(OptionsENUM.LAPLACE_SMOOTHING)){
            options.add("-A");
        }
        if (values.containsKey(OptionsENUM.RANDOM_NUMBER_SEED)){
            options.add("-Q");
            options.add(values.get(OptionsENUM.RANDOM_NUMBER_SEED));
        }
        this.j48.setOptions(options.toArray(new String[options.size()]));
    }
    public void train(DataSetDTO dataSetDTO) throws Exception {
        Instances J48instances = new Instances(dataSetDTO.getName(), dataSetDTO.getAttributeName(),dataSetDTO.getCapacity());
        j48.buildClassifier(J48instances);
    }


}
