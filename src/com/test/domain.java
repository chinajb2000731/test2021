package com.test;

public class domain {
    private String id;
    private String name;
    private String age;
    private String age1;
    @Override
    public String toString() {
        return "domain{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

