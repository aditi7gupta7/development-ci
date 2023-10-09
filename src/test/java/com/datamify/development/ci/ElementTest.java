package com.datamify.development.ci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementTest {

    @Test
    void shouldTestAddElement() {
        final Element firstElement = new Element(6);
        final Element secondElement = new Element(7);

        final Element resultElement = firstElement.add(secondElement);
        assertEquals(resultElement.getValue(), 13);
    }

}
