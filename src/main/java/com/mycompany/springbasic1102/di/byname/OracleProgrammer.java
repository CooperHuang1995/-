package com.mycompany.springbasic1102.di.byname;

public class OracleProgrammer {
    private String name;
    private Language java;

    public void setName(String name) {
        this.name = name;
    }

    public void setJava(Language java) {
        this.java = java;
    }

    @Override
    public String toString() {
        return "OracleProgrammer{" + "name=" + name + ", java=" + java + '}';
    }
    
}
