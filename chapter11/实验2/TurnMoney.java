
import java.sql.*; 
public class TurnMoney {
    public static void main(String args[]){
       Connection con = null;
       Statement sql; 
       ResultSet rs;
       try {������1�� //�������ݿ������� 
       }
       catch(ClassNotFoundException e){
             System.out.println(""+e);
       }
       try{ double n = 100;
            con = ������2��//�������ݿ�
           ������3���ر��Զ��ύģʽ
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
            rs.next();
            double amountOne = rs.getDouble("amount");
            System.out.println("ת�˲���֮ǰzhangsan��Ǯ������:"+amountOne); 
            rs = sql.executeQuery("SELECT * FROM card2 WHERE number='xidanShop'");
            rs.next();
            double amountTwo = rs.getDouble("amount");
            System.out.println("ת�˲���֮ǰxidanShop��Ǯ������:"+amountTwo);
            amountOne = amountOne-n;
            amountTwo = amountTwo+n; 
            sql.executeUpdate(
"UPDATE card1 SET amount ="+amountOne+" WHERE number ='zhangsan'");
            sql.executeUpdate(
"UPDATE card2 SET amount ="+amountTwo+" WHERE number ='xidanShop'");
            con.commit(); //��ʼ������,��������쳣ֱ��ִ��catch��
            ������4���ָ��Զ��ύģʽ
            rs = sql.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
            rs.next();
            amountOne = rs.getDouble("amount");
            System.out.println("ת�˲���֮��zhangsan��Ǯ������:"+amountOne); 
            rs = sql.executeQuery("SELECT * FROM card2 WHERE number='xidanShop'");
            rs.next();
            amountTwo = rs.getDouble("amount");
            System.out.println("ת�˲���֮��xidanShop��Ǯ������:"+amountTwo);
            con.close();
         }
         catch(SQLException e){
            try{ ������5���������������Ĳ���
            }
            catch(SQLException exp){}
            System.out.println(e.toString());
         }
    }
}
