import java.util.Scanner;
public class Number {
   public static void main(String args[]) {
      int number=0,d5,d4,d3,d2,d1;
      Scanner reader = new Scanner(System.in);
      System.out.println("输入一个1至99999之间的数");
      number = reader.nextInt();
      if(【代码1】) //判断number在1至99999之间的条件
      {        【代码2】   //计算number的最高位（万位）d5
               【代码3】   //计算number的千位d4
               【代码4】   //计算number的百位d3
                d2=number%100/10;
                d1=number%10;
                if(【代码5】)  //判断number是5位数的条件
                {  System.out.println(number+"是5位数");
                   if(【代码6】) //判断number是回文数的条件
                   {   System.out.println(number+"是回文数");
                   }
                   else
                   {   System.out.println(number+"不是回文数");
                   }
                }
                else if(【代码7】)  //判断number是4位数的条件
                {  System.out.println(number+"是4位数");
                   if(【代码8】) //判断number是回文数的条件码
                   {  System.out.println(number+"是回文数");
                   }
                  else
                   {  System.out.println(number+"不是回文数");
                   }
                }
                else if(【代码9】)  //判断number是3位数的条件
                {  System.out.println(number+"是3位数");
                   if(【代码10】) //判断number是回文数的条件
                   {  System.out.println(number+"是回文数");
                   }
                  else
                   {  System.out.println(number+"不是回文数");
                   }
                }
                else if(d2!=0)
                {  System.out.println(number+"是2位数");
                   if(d1==d2)
                   {  System.out.println(number+"是回文数");
                   }
                  else
                   {  System.out.println(number+"不是回文数");
                   }
                }
                else if(d1!=0)
                {  System.out.println(number+"是1位数");
                   System.out.println(number+"是回文数");
                }
            }
      else 
      {  System.out.printf("\n%d不在1至99999之间",number);
      }
   }
}
