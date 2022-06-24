package com.bjpowernode.vo;

public class Student {
    private  String uName;
    private  int uAge;

    public Student() {
    }

    public Student(String uName, int uAge) {
        this.uName = uName;
        this.uAge = uAge;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }
}
