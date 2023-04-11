package org.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentCollection {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public StudentCollection() {
    }

    public StudentCollection(String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties properties) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "StudentCollection{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
