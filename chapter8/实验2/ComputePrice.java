import java.util.*;
public class ComputePrice {
   public static void main(String args[]) {
      String menu = "������Ѽ:189Ԫ ���۳���:12.9Ԫ �����:69Ԫ ����ţ��:32Ԫ";
      Scanner scanner =������1�� //ʹ�ù��췽��Scanner(String str)����scanner,��menu���ݸ����췽���Ĳ���
      String regex = "[^0123456789.]+";
      ������2�� //scanner����useDelimiter(String regex)����regex���ݸ��÷����Ĳ���
      double sum=0;
      while(scanner.hasNext()){
         try{ 
              double price = ������3�� //scanner����nextDouble()�������ֵ���
              sum = sum+price;
              System.out.println(price);
         } 
         catch(InputMismatchException exp){
              String t = scanner.next();
         }   
      }
      System.out.println("�˵��ܼ۸�:"+sum+"Ԫ");
   }
}
