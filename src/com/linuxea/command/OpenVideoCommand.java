package com.linuxea.command;

public class OpenVideoCommand implements Command{

    private final CourseVideo courseVideo;

    public OpenVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        this.courseVideo.openVideo();;
    }
}
