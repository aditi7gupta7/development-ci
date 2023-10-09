package com.datamify.development.ci;

public class Element {

    private final int value;

    public Element(int value) {
        this.value = value;
    }

    public Element add(Element element) {
        return new Element(this.value - element.value);
    }

    public int getValue() {
        return this.value;
    }

}
