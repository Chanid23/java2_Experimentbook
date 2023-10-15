
import java.sql.*; 
public class ComputerAverPrice {
    public static void main(String args[]) {
       Connection con=null;
       Statement sql; 
       ResultSet rs;
       try{  
           【代码1】//加载Access数据库连接器
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
            rs =【代码2】 //sql调用.executeQuery方法查询bookList表中的全部记录
            rs.last();
            int max = rs.getRow();
            System.out.println("表共有"+max+"条记录,随机抽取10条记录：");
            int [] a =GetRandomNumber.getRandomNumber(max,10);
            float sum = 0;
            for(int i:a){ 
                【代码3】//将rs的游标游标移到第i行                
                float price = rs.getFloat(3);
                sum = sum+price;
            }
            con.close();
            System.out.println("平均价格:"+sum/a.length);
      }
      catch(SQLException e) { }
  }
}  