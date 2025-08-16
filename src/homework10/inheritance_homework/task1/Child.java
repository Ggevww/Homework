package homework10.inheritance_homework.task1;

public class Child extends Parent{
    @Override
    public void showMessage(){
        System.out.println("Hello child class!");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage();

    }

}
