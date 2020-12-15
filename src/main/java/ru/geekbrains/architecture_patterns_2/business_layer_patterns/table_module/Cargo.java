package ru.geekbrains.architecture_patterns_2.business_layer_patterns.table_module;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Cargo {
    private Integer id;
    private String name;
    private Boolean isFragile;
}
