import com.linuxea.command.CloseVideoCommand;
import com.linuxea.command.CourseVideo;
import com.linuxea.command.OpenVideoCommand;
import com.linuxea.command.Stuff;

public class Main {


    public static void main(String[] args) {

        CourseVideo courseVideo = new CourseVideo("java 设计模式");

        // create two commands
        OpenVideoCommand openVideoCommand = new OpenVideoCommand(courseVideo);
        CloseVideoCommand closeVideoCommand = new CloseVideoCommand(courseVideo);

        //linuxea is a poor stuff
        Stuff linuxea = new Stuff();

        // call commands
        linuxea.ask(openVideoCommand);
        linuxea.ask(closeVideoCommand);

        linuxea.doCommands();
    }
}