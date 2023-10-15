import java.io.*;
import java.net.*;
import java.util.*;
public class ClientItem  {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      Socket clientSocket=null;
      DataInputStream inData=null;
      DataOutputStream outData=null;
      Thread thread ; 
      Read read=null;
      try{  clientSocket=new Socket();
            read = new Read();   
            thread = new Thread(read);   //�����ȡ��Ϣ���߳�
            System.out.print("�����������IP:");
            String IP = scanner.nextLine();
            System.out.print("����˿ں�:");
            int port = scanner.nextInt();
            String enter=scanner.nextLine(); //���Ļس� 
            if(clientSocket.isConnected()){}
            else{
              InetAddress  address=InetAddress.getByName(IP);
              InetSocketAddress socketAddress=new InetSocketAddress(address,port);
              clientSocket.connect(socketAddress); 
              InputStream in=������1��  //clientSocket����getInputStream()���ظ��׽��ֵ�������
              OutputStream out=������2��//clientSocket����getOutputStream()���ظ��׽��ֵ������
              inData =new DataInputStream(in); 
              outData = new DataOutputStream(out);
              read.setDataInputStream(inData);
              read.setDataOutputStream(outData);
              thread.start();  //�����������Ϣ���߳�
            }
       }
       catch(Exception e) {
            System.out.println("�������ѶϿ�"+e);
       }
   }
}
class Read implements Runnable {
   Scanner scanner = new Scanner(System.in);
   DataInputStream in;
   DataOutputStream out;
   public void setDataInputStream(DataInputStream in) {
      this.in = in;
   }
   public void setDataOutputStream(DataOutputStream out) {
      this.out = out;
   }
   public void run() {
      System.out.println("�����˵�:");
      String content = scanner.nextLine();
      try{  out.writeUTF("�˵�"+content); 
            String str = in.readUTF();
            System.out.println(str);
            str = in.readUTF();
            System.out.println(str);
            str = in.readUTF();
            System.out.println(str);
      } 
      catch(Exception e) {}     
   }
}

