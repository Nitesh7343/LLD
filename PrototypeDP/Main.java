package PrototypeDP;

public class Main {

    public static void main(String[] args) {
        EmailTemplate t1 = EmailTemplateRegistry.getTemplate("welcome");
        System.out.println(t1.getContent());
        t1.setContent("Type-1");
        System.out.println(t1.getContent());

        EmailTemplate t2 = EmailTemplateRegistry.getTemplate("welcome");
        System.out.println(t2.getContent());
        t2.setContent("Type-2");

        System.out.println(t1.getContent());
        System.out.println(t2.getContent());

        t1.send("niesh@gmail.com");
        t2.send("niesh@gmail.com");
    }
}
