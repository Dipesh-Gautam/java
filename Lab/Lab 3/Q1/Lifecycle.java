import java.applet.Applet;
import java.awt.Graphics;
public class Lifecycle extends Applet{
    public void init(){
        System.out.println("Now applet will be in born state");
    }
    public void start(){
        System.out.println("It will go in running state");
    }
    public void paint(Graphics g){
        g.drawString("It will also go in running state");
    }
    public void stop(){
        System.out.println("Applet is now going to idle state");
    }
    public void destroy(){
        System.out.println("Now applet is going to dead state");
    }
}
