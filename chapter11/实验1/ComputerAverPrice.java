
import java.sql.*; 
public class ComputerAverPrice {
    public static void main(String args[]) {
       Connection con=null;
       Statement sql; 
       ResultSet rs;
       try{  
           ������1��//����Access���ݿ�������
       }
       catch(Exception e){ }
       try{
           con = DriverManager.getConnection("jdbc:Access://Book.accdb","","");
       }
       catch(SQLException e){ 
           System.out.println(e);
       }
       try{
            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            rs =������2�� //sql����.executeQuery������ѯbookList���е�ȫ����¼
            rs.last();
            int max = rs.getRow();
            System.out.println("����"+max+"����¼,�����ȡ10����¼��");
            int [] a =GetRandomNumber.getRandomNumber(max,10);
            float sum = 0;
            for(int i:a){ 
                ������3��//��rs���α��α��Ƶ���i��                
                float price = rs.getFloat(3);
                sum = sum+price;
            }
            con.close();
            System.out.println("ƽ���۸�:"+sum/a.length);
      }
      catch(SQLException e) { }
  }
}  