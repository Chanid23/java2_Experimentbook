import java.io.*;
import java.net.*;
import java.util.*;
public class ServerItem {
   public static void main(String args[]) {
      ServerSocket server=null;
      ServerThread thread;
      Socket you=null;
      while(true) { 
          try{  server= ������3��//�����ڶ˿�4331�ϸ�������� ServerSocket����
          }
          catch(IOException e1) { 
               System.out.println("���ڼ���");   
          } 
          try{  System.out.println("���ڵȴ��ͻ�");
                you= ������4�� // server����accept()���غͿͻ��������ӵ�Socket����
                System.out.println("�ͻ��ĵ�ַ:"+you.getInetAddress());
          }
         catch (IOException e) {
               System.out.println(""+e);
         }
         if(you!=null) {
               new ServerThread(you).start();  
         }
      }
   }
}
class ServerThread extends Thread {
   Socket socket;
   DataInputStream in=null; 
   DataOutputStream out=null;
   ServerThread(Socket t) {
      socket=t;
      try  { out=new DataOutputStream(socket.getOutputStream()); 
             in=new DataInputStream(socket.getInputStream());
           }
      catch (IOException e) {}
   }  
   public void run() { 
      try{
          String item = in.readUTF(); 
          Scanner scanner = new Scanner(item);
          scanner.useDelimiter("[^0123456789.]+"); 
          if(item.startsWith("�˵�")) { 
            double sum=0;
            while(scanner.hasNext()){
             try{  double price = scanner.nextDouble();
                   sum = sum+price;
                   System.out.println(price);
             } 
             catch(InputMismatchException exp){
                  String t = scanner.next();
             }
           } 
           out.writeUTF("�����˵�:");
           out.writeUTF(item);
           out.writeUTF("�ܶ�:"+sum+"Ԫ");  
         }
      }
      catch(Exception exp){}
   } 
}
