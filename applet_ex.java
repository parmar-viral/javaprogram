import java.applet.*;
import java.awt.*;
public class applet_ex extends Applet {
    public void paint(Graphics g, String sarif){
      
        Color c=new Color(100,0,100);
        g.setColor(c);
       // Font f=new Font(sarif, 10, Font.BOLD);
       // g.setFont(f);
        g.drawString("java applete example", 50, 50);

    }
}
/*
<applet code="applet_ex.class" height="200" width="200" ></applet> 
 */

