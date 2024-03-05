import java.applet.*;
import java.awt.*;
public class simple_applt extends Applet {
   
    public void paint(Graphics g){
        g.drawString("simple applet example", 100, 100);
    }
}
/*
 <applet code="simple_applt.class" height="200" width="200"></applet>
 */
