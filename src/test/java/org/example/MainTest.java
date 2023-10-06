package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testParseXML_ValidFile_ReturnsEmployeesList() {

        String fileName = "data.xml";
        List<Employee> employees = Main.parseXML(fileName);
        Assertions.assertNotNull(employees);
        Assertions.assertFalse(employees.isEmpty());
    }

    @Test
    public void testParseXML_InvalidFile_ReturnsEmptyEmployeesList() {

        String fileName = "invalid.xml";
        List<Employee> employees = Main.parseXML(fileName);
        Assertions.assertNotNull(employees);
        Assertions.assertTrue(employees.isEmpty());
    }

    @Test
    public void testListToJson_ValidEmployeesList_ReturnsJsonString() {
        List<Employee> employees = createSampleEmployees();
        String json = Main.listToJson(employees);
        Assertions.assertNotNull(json);
        Assertions.assertFalse(json.isEmpty());

    }
    private List<Employee> createSampleEmployees() {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("John");
        employee1.setLastName("Doe");
        employee1.setCountry("USA");
        employee1.setAge(30);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("Jane");
        employee2.setLastName("Smith");
        employee2.setCountry("Canada");
        employee2.setAge(28);
        employees.add(employee2);

        return employees;
    }
}