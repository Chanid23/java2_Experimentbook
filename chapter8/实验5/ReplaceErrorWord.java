import java.util.regex.*;
public class ReplaceErrorWord {
   public static void main(String args[ ]) { 
      String str = "�������룬��Ҫ����ʧ�����½www.yy.cn���½www.tt.cc";
      Pattern pattern;        
      Matcher matcher;         
      String regex = "��½";
      pattern = ������1��   //ʹ��regex���Ի�ģʽ����pattern
      matcher = ������2��   //�õ�����str��ƥ�����matcher
      while(matcher.find()) {
         String s = matcher.group();
         System.out.print(matcher.start()+"λ�ó���:");
         System.out.println(s);
      } 
      System.out.println("��\"��½\"�滻Ϊ\"��¼\"���ַ���:");
      String result = matcher.replaceAll("��¼");
      System.out.println(result);
      pattern= Pattern.compile("����ʧ��");  
      matcher = pattern.matcher(result);           
      System.out.println("��\"����ʧ��\"�滻Ϊ\"����ʧ��\"���ַ���:");
      result = matcher.replaceAll("����ʧ��");
      System.out.println(result);
   }
}

