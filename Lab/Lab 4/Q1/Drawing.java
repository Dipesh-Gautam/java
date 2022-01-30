import java.awt.*;
import javax.swing.*;
class Drawing extends JFrame{
    Drawing(){
        setSize(1100,1100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawOval(100, 100, 300, 300);
        int x[] = {600,500,700};
        int y[] = {100,400,400};
        Polygon triangle = new Polygon(x,y,3);
        g.drawPolygon(triangle);
        g.drawOval(800,200,300,100);


    }

    public static void main(String[] args){
        new Drawing();
    }
}