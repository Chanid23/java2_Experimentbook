import java.io.*;
import java.net.*;
import java.util.*;
public class ServerItem {
   public static void main(String args[]) {
      ServerSocket server=null;
      ServerThread thread;
      Socket you=null;
      while(true) { 
          try{  server= 【代码3】//创建在端口4331上负责监听的 ServerSocket对象
          }
          catch(IOException e1) { 
               System.out.println("正在监听");   
          } 
          try{  System.out.println("正在等待客户");
                you= 【代码4】 // server调用accept()返回和客户端相连接的Socket对象
                System.out.println("客户的地址:"+you.getInetAddress());
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
          if(item.startsWith("账单")) { 
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
           out.writeUTF("您的账单:");
           out.writeUTF(item);
           out.writeUTF("总额:"+sum+"元");  
         }
      }
      catch(Exception exp){}
   } 
}
