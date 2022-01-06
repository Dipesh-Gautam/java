import java.applet.Applet;
import java.awt.Graphics;
public class AppletParameter {
    String name;
    public void init(){
        name = getParameter("nas");
    }    
    public void paint(Graphics g){
        g.drawString(name,100,100);
    }
}
