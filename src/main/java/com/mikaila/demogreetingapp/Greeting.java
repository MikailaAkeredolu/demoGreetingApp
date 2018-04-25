package com.mikaila.demogreetingapp;

public class Greeting {

    private final long id;
    private final String content;
    private final String sex;


    public Greeting(long id, String content,String sex) {
        this.id = id;
        this.content = content;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getSex() {
        return sex;
    }
}
