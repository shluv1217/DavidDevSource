package com.example.test;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<String> folderlist;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setFolderlist(List<String> folderlist) {
        this.folderlist = folderlist;
    }
    
    public List<String> getFolderList() {
        return folderlist;
    }
}