package lk.ijse;

public class Boy implements DI{
    Agrement agrement;


    public void chatWithGirl(){
        agrement.chat();
    }
    public void test(){
        agrement.chat();
    }
    public static void main(String[] args){
        Boy boy =new Boy();
        //boy.setter(new Girl());
        boy.inject(new Girl()); // dependency inject to implement interface method
        boy.chatWithGirl();
        boy.test();
    }

    @Override
    public void inject(Agrement a) {
        this.agrement=a;
    }
}
