package lk.ijse;

public class Boy {
    Agrement agrement;

    public void setter(Agrement a){
        this.agrement=a;       //this as same in constructor inject-
    }
    public void chatWithGirl(){
        agrement.chat();
    }
    public void test(){
        agrement.chat();
    }
    public static void main(String[] args){
        Boy boy =new Boy();
        boy.setter(new Girl()); // setter method eka call wena witadi dependency inject we.
        boy.chatWithGirl();
        boy.test();
    }
}
