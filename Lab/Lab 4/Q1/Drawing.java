import java.awt.*;
import javax.swing.*;
class Drawing extends JFrame{
    Drawing(){
        setSize(1200,1200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawOval(100, 100, 300, 300);//making circle
        
        int x[] = {600,500,700};
        int y[] = {100,400,400};
        Polygon triangle = new Polygon(x,y,3);//making polygon/triangle.    Polygon(x,y,number of sides)
        g.drawPolygon(triangle);

        g.drawOval(800,200,300,100);//making ellipse

        int a[] = {300,420,400,200,180};
        int b[] = {500,600,725,725,600};
        Polygon pentagon = new Polygon(a,b,b.length);//b.length = 5 
        g.drawPolygon(pentagon);

        int d[] = {585,715,800,715,585,500};
        int e[] = {500,500,600,700,700,600};
        Polygon hexagon = new Polygon(d,e,d.length);//d.length = 6
        g.drawPolygon(hexagon);



        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 300, 300);

        g.setColor(Color.RED);
        g.fillPolygon(triangle);

        g.setColor(Color.MAGENTA);
        g.fillOval(800,200,300,100);
        g.setColor(Color.BLUE);
        g.fillPolygon(pentagon);

        g.setColor(Color.GREEN);
        g.fillPolygon(hexagon);


    }

    public static void main(String[] args){
        new Drawing();
    }
}