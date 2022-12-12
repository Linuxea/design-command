package com.linuxea.command;

public class CloseVideoCommand implements Command{

    private final CourseVideo courseVideo;

    public CloseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        this.courseVideo.closeVideo();;
    }
}
