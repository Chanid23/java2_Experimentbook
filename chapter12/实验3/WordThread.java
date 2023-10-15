import javax.swing.JTextField;
public class WordThread extends Thread {
    char word;
    int startPosition =19968; //Unicode���19968λ����32320�ϵĺ���
    int endPosition = 32320;
    JTextField showWord; 
    int sleepLength = 6000;
    public void setJTextField(JTextField t) {
        showWord = t;
        showWord.setEditable(false); 
    }   
    public void setSleepLength(int n){
       sleepLength = n;
    } 
    public void run() {
       int k=startPosition;
       while(true) {
          word=(char)k;
          showWord.setText(""+word);
          try{  sleep(sleepLength);   //������1��//����sleep����ʹ���߳��ж�sleepLength����
          }
          catch(InterruptedException e){}
          k++;
          if(k>=endPosition)  
             k=startPosition;
        }
    } 
}
