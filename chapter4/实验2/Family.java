public class Family { 
    TV homeTV;
    void buyTV(TV tv) {
       ������1��            //������tv��ֵ��homeTV
    }
    void remoteControl(int m) {
       homeTV.setChannel(m);  
    }
    void seeTV() {
       homeTV.showProgram();  //homeTV����showProgram()����
    }
}
