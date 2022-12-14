package com.example.classification_service.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelsDTO {
    @JsonProperty(value = "AppId")
    private List<String> appId;
    @JsonProperty(value = "ServiceId")
    private List<String> serviceId;
}
