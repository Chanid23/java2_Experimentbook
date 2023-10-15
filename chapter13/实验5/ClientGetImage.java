import java.net.*;
import java.awt.*; 
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class ImageCanvas extends Canvas {
   Image image=null;
   public ImageCanvas() {
      setSize(200,200);
   }
   public void paint(Graphics g) {
      if(image!=null)
        g.drawImage(image,0,0,this);
   }
   public void setImage(Image image) {
      this.image=image;
   }
}
public class ClientGetImage extends JFrame implements Runnable,ActionListener {
   JButton b=new JButton("��ȡͼ��");
   ImageCanvas canvas;
   ClientGetImage() {
      super("I am a client");
      setSize(320,200);
      setVisible(true);
      b.addActionListener(this);
      add(b,BorderLayout.NORTH);
      canvas=new ImageCanvas();
      add(canvas,BorderLayout.CENTER);
      Thread thread=new Thread(this);
      validate(); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      thread.start();                              
   }
   public void actionPerformed(ActionEvent event) {     
      byte b[]="�뷢ͼ��".trim().getBytes();
      try{  InetAddress address=InetAddress.getByName("127.0.0.1");
            DatagramPacket data= ������1�� //�������ݰ�data�������ݰ���Ŀ���ַ�Ͷ˿ڷֱ���
                                          //address��1234�����е�����Ϊ����b�е�ȫ���ֽڡ�
            DatagramSocket mailSend=������2�� //�������������ݵ�mailSend����
            ������3�� //mailSend��������data��
          }
      catch(Exception e){}     
   } 
   public void run() {                             
      DatagramPacket pack=null;
      DatagramSocket mailReceive=null;
      byte b[]=new byte[8192];
      ByteArrayOutputStream out=new ByteArrayOutputStream();
      try{    pack=new DatagramPacket(b,b.length);
              mailReceive =������4�� //�����ڶ˿�5678������ȡ���ݰ���mailReceive����
         }
      catch(Exception e){} 
      try{   while(true)   
              {  mailReceive.receive(pack); 
                 String message=new String(pack.getData(),0,pack.getLength());
                 if(message.startsWith("end")) {
                    break;
                 }
                 out.write(pack.getData(),0,pack.getLength());
              }
           byte imagebyte[]=out.toByteArray();
           out.close();
           Toolkit tool=getToolkit();
           Image image=tool.createImage(imagebyte);
           canvas.setImage(image);
           canvas.repaint();
           validate();
         }
      catch(IOException e){}
   }
   public static void main(String args[]) {
      new ClientGetImage();
   }
}
