import java.awt.*;  
  
  
public class FrameOne {  
public FrameOne()  
    {  
Frame f = new Frame();  
        Button btn=new Button("Hello World");  
        btn.setBounds(80, 80, 100, 50);  
        f.add(btn);         //adding a new Button.  
        f.setSize(300, 250);        //setting size.  
        f.setTitle("JavaTPoint");  //setting title.  
        f.setLayout(null);   //set default layout for frame.  
        f.setVisible(true);           //set frame visibility true.  
    }  
  
  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
  
        FrameOne awt = new FrameOne();   //creating a frame.  
    }  
} 