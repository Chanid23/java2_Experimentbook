import java.math.*;
public class HandleBigInteger {
   public static void main(String args[]) {
      BigInteger n1=new BigInteger("987654321987654321987654321"),
                 n2=new BigInteger("123456789123456789123456789"),
                 result=null;
       result=【代码1】//n1和n2做加法运算
       System.out.println("和:"+result.toString());
       result=【代码2】//n1和n2做减法运算
       System.out.println("差:"+result.toString());
       result=【代码3】//n1和n2做乘法运算
       System.out.println("积:"+result.toString());
       result=【代码4】//n1和n2做除法运算
       System.out.println("商:"+result.toString());
       BigInteger m=new BigInteger("17637"),
                  COUNT=new BigInteger("0"),
                  ONE=new BigInteger("1"),
                  TWO=new BigInteger("2");
      System.out.println(m.toString()+"的因子有:");
      for(BigInteger i=TWO;i.compareTo(m)<0;i=i.add(ONE)) {
          if((n1.remainder(i).compareTo(BigInteger.ZERO))==0) {
              COUNT=COUNT.add(ONE);
              System.out.print(" "+i.toString());
          }
      }
      System.out.println("");
      System.out.println(m.toString()+"一共有"+COUNT.toString()+"个因子");    
   }
}
