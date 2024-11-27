package com.example.demo.model;

public class Option {
    private String value;
    private String label;

    // 기본 생성자
    public Option() {
    }

    // 매개변수 있는 생성자
    public Option(String value, String label) {
        this.value = value;
        this.label = label;
    }

    // Getter 및 Setter
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Option{" +
                "value='" + value + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
