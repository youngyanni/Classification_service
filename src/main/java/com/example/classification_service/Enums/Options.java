package com.example.classification_service.Enums;


import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum Options {
    U("-U"),
    C("-S"),
    M("-M"),
    R("-R"),
    N("-N"),
    B("-B"),
    S("-S"),
    L("-L"),
    A("-A"),
    Q("-Q");
    private final String param;
}
