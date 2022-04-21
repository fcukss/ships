package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("пользователь1");
        User u2 = new User("пользователь2");
        User u3 = new User("пользователь3");

        u1.sendMessage(u2,"hello!");
        u1.sendMessage(u2, "Bro");
        u2.sendMessage(u1, "Hi");
        u2.sendMessage(u1," how are you");
        u2.sendMessage(u1,"?");
        u3.sendMessage(u1,"fuck");
        u3.sendMessage(u1,"fuck");
        u3.sendMessage(u1,"fuck");
        u1.sendMessage(u3,"hello!");
        u1.sendMessage(u3,"hello!");
        u1.sendMessage(u3,"hello!");
        u3.sendMessage(u1,"fuck");

        MessageDatabase.showDialog(u1,u3);
    }
}
