package com.fiap.techchallenge.homeAppliance.controller.json;

import com.fiap.techchallenge.homeAppliance.domain.HomeAppliance;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HomeApplianceJson {

    @NotBlank
    private String name;

    @NotBlank
    private String model;

    @NotBlank
    private String brand;

    private String color;

    @NotNull
    private Long power;

    @NotNull
    private Long voltage;

    public HomeAppliance toHomeAppliance() {
        return HomeAppliance.builder()
                .name(name)
                .model(model)
                .brand(brand)
                .color(color)
                .power(power)
                .voltage(voltage)
                .build();
    }
}
