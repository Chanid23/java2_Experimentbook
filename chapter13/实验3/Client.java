import java.io.*;
import java.net.*;
import java.util.*;
public class Client  {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      Socket mysocket=null;
      ObjectInputStream inObject=null;
      ObjectOutputStream outObject=null;
      Thread thread ; 
      ReadWindow readWindow=null;
      try{  mysocket=new Socket();
            readWindow = new ReadWindow();   
            thread = new Thread(readWindow);        //�����ȡ��Ϣ���߳�
            System.out.print("�����������IP:");
            String IP = scanner.nextLine();
            System.out.print("����˿ں�:");
            int port = scanner.nextInt();
            if(mysocket.isConnected()){}
            else{
              InetAddress  address=InetAddress.getByName(IP);
              InetSocketAddress socketAddress=new InetSocketAddress(address,port);
              mysocket.connect(socketAddress); 
              InputStream in = ������1��  //mysocket����getInputStream()���ظ��׽��ֵ�������
              OutputStream out = ������2��//mysocket����getOutputStream()���ظ��׽��ֵ������
              inObject =new ObjectInputStream(in); 
              outObject = new ObjectOutputStream(out);
              readWindow.setObjectInputStream(inObject);
              thread.start();  //���������ȡ���ڵ��߳�
            }
       }
       catch(Exception e) {
            System.out.println("�������ѶϿ�"+e);
       }
   }
}
class ReadWindow implements Runnable {
   ObjectInputStream  in;
   public void setObjectInputStream(ObjectInputStream  in) {
      this.in = in;
   }
   public void run() {
      double result = 0;
      while(true) {
        try{ javax.swing.JFrame window = (javax.swing.JFrame)in.readObject();
             window.setTitle("���Ǵӷ������϶���Ĵ���");
             window.setVisible(true);
             window.requestFocusInWindow();//requestFocus();
             window.setSize(600,800); 
            
        }
        catch(Exception e) { 
             System.out.println("��������ѶϿ�"+e);
             break;
        }   
      }
   }
}

