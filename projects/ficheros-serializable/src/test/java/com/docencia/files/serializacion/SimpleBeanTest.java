package com.docencia.files.serializacion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SimpleBeanTest {

    @Test
    void simpleBeanTest() {
        XmlMapper xmlMapper = new XmlMapper();
        String xml;
        try {
            xml = xmlMapper.writeValueAsString(new SimpleBean());
            assertNotNull(xml);
        } catch (Exception e) {
            Assertions.fail("Se ha producido un error no controlado", e);
        }
    }

    @Test
    void simpleBeanSerializarTest() {
        XmlMapper xmlMapper = new XmlMapper();
        String xml;
        try {
            xml = xmlMapper.writeValueAsString(new SimpleBean());
            assertNotNull(xml);
            assertTrue(xml.contains("<x>1</x>"));
        } catch (Exception e) {
            Assertions.fail("Se ha producido un error no controlado", e);
        }
    }

    @Test
    void simpleBeanDeserializarTest() {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            SimpleBean value = xmlMapper.readValue(
            "<SimpleBean><x>1</x><y>2</y></SimpleBean>", 
            SimpleBean.class);
            assertTrue(value.getX() == 1 && value.getY() == 2);
        } catch (Exception e) {
            Assertions.fail("Se ha producido un error no controlado", e);
        }
    }
}
