package com.example.SistemaAluguelCarros.models.enums;

public enum Status {
    AGENTE("AGENTE"),
    CLIENTE("CLIENTE"),
    BANCO("BANCO");

    private final String value;


    Status(String value) {
        this.value = value;
    }


    public String getValue(){
        return value;
    }
}
