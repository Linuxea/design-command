package com.linuxea.command;

public class CourseVideo {

    private final String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void openVideo(){
        System.out.println(this.name + "打开");
    }


    public void closeVideo(){
        System.out.println(this.name + "关闭");
    }

}
