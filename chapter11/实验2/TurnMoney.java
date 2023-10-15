
import java.sql.*; 
public class TurnMoney {
    public static void main(String args[]){
       Connection con = null;
       Statement sql; 
       ResultSet rs;
       try {【代码1】 //加载数据库连接器 
       }
       catch(ClassNotFoundException e){
             System.out.println(""+e);
       }
       try{ double n = 100;
            con = 【代码2】//连接数据库
           【代码3】关闭自动提交模式
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
            rs.next();
            double amountOne = rs.getDouble("amount");
            System.out.println("转账操作之前zhangsan的钱款数额:"+amountOne); 
            rs = sql.executeQuery("SELECT * FROM card2 WHERE number='xidanShop'");
            rs.next();
            double amountTwo = rs.getDouble("amount");
            System.out.println("转账操作之前xidanShop的钱款数额:"+amountTwo);
            amountOne = amountOne-n;
            amountTwo = amountTwo+n; 
            sql.executeUpdate(
"UPDATE card1 SET amount ="+amountOne+" WHERE number ='zhangsan'");
            sql.executeUpdate(
"UPDATE card2 SET amount ="+amountTwo+" WHERE number ='xidanShop'");
            con.commit(); //开始事务处理,如果发生异常直接执行catch块
            【代码4】恢复自动提交模式
            rs = sql.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
            rs.next();
            amountOne = rs.getDouble("amount");
            System.out.println("转账操作之后zhangsan的钱款数额:"+amountOne); 
            rs = sql.executeQuery("SELECT * FROM card2 WHERE number='xidanShop'");
            rs.next();
            amountTwo = rs.getDouble("amount");
            System.out.println("转账操作之后xidanShop的钱款数额:"+amountTwo);
            con.close();
         }
         catch(SQLException e){
            try{ 【代码5】撤消事务所做的操作
            }
            catch(SQLException exp){}
            System.out.println(e.toString());
         }
    }
}
