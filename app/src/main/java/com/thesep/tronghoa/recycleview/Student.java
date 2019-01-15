package com.thesep.tronghoa.recycleview;

public class Student {
    private String name;
    private String diachi;
    public Student() {
    }

    public Student(String name, String diachi) {
        this.name = name;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
