package org.example.lab2.entity;import lombok.Getter;import lombok.Setter;@Getter@Setterpublic class Student {    private int id;    private String name;    private int age;    public Student(int id, String name, int age) {        this.id = id;        this.name = name;        this.age = age;    }}