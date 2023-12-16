package lk.ijse;

public class Boy {
    Agrement agrement;

    public Boy(Agrement a){
        this.agrement= a; //depend class dependency asign to  true in constructor
    }
    public Boy(){
    }
    public void chatWithGirl(){
        agrement.chat();
    }
    public void test(){
        agrement.chat();
    }
    public static void main(String[] args){
        Boy boy =new Boy(new Girl());
        boy.chatWithGirl();
        boy.test();
    }
}
