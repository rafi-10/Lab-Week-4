class Iphone{
    String os,ram,processor;
    Iphone(){
    }
    public Iphone(String os ,String ram, String processor){
        this.os=os;
        this.ram=ram;
        this.processor=processor;
    }
    void display() {
        System.out.println("The OS Is: " + os);
        System.out.println("The Amount of Ram Is: " + ram);
        System.out.println("The Processor Is: " + processor);
        System.out.println("=============================");
    }
}
public class Task_01 {
    public static void main(String[] args) {
        Iphone phone1 = new Iphone();
        phone1.display();
        Iphone phone2 = new Iphone("Apple A13 Bionic","8GB","iOS 14.1");
        phone2.display();
        Iphone phone3 = new Iphone("Apple A14 Bionic","12GB","iOS 14.2");
        phone3.display();
    }
}



