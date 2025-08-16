package homework10.inheritance_homework.task2;

public class SubClass extends SuperClass{
    String message = "Hello SubClass class";

    public void showMessage(){
        System.out.println(message);
    }
    public void showMessage(String x){
        if(x == "super"){
            System.out.println(super.message);

        }else {
            showMessage();
        }

    }

    public static void main(String[] args) {
        SubClass test = new SubClass();
        test.showMessage();
        test.showMessage("super");
    }

}
