package com.zeta.ex02;

/**
 * Created by Administrator on 17-1-15.
 */
public class Homework {
    private String name;
    private String address;
    private int numCourses;
    private String []courses=new String[30];
    private int []grades=new int[30];

    public Homework(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        String a = name + "(" + address + ")";
        return a;
    }
    public void addCourseGrade(String course,int grade){
        int len = 0;
        //实际元素个数取得
        for(int b = 0;b < courses.length;b++){
            if(null != courses[b]) len ++;
        }
        //没有数据的场合，
        if(len == 0){
            courses[0] = course;
            grades[0] = grade;
        }else {
            for(int a = 0;a < len;a++){
                if (courses[a] == course){
                    System.out.println(course + "已经登录");
                    break;
                }else if(a == len - 1 ){
                    courses[a + 1] = course;
                    grades[a + 1] = grade;
                }
            }
        }
    }
    public void printGrades(){
        int len = 0;
        //实际元素个数取得
        for(int b = 0;b < courses.length;b++){
            if(null != courses[b]) len ++;
        }
        String b = "";
        for(int a = 0;a < len;a++){
            if(a == len - 1){
                b = b + courses[a] + ":" + grades[a];
            }else {
                b = b + courses[a] + ":" + grades[a] + ",";
            }
        }
        System.out.println("name " + b);
    }
    public double getAverageGrade(){
        int len = 0;
        //实际元素个数取得
        for(int b = 0;b < courses.length;b++){
            if(null != courses[b]) len ++;
        }
        int go1 = 0;
        int go2 = 0;
        for(int a = 0;a <= len; a++){
            go1 += grades[a];
        }
        go2 = go1 / len;
        return go2;

    }
}