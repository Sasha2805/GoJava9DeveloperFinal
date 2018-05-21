package com.javanine.finalProject.dto.dtoRead;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@link StatusReadDTO} to read a {@link com.javanine.finalProject.model.Status} entity by Rest Controller.
 */

@Getter
@Setter
@ApiModel
public class StatusReadDTO {
    @ApiModelProperty(position = 1)
    private Long id;

    @ApiModelProperty(position = 2)
    private String name;
}
