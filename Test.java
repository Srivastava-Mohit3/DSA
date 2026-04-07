interface Name {
    void setName(String name);
}

interface Email extends Name {
    void setEmail(String email);

}

class Main implements Email {
    String name;
    String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void getData() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

public class Test {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setName("Mohit Srivastava");
        obj.setEmail("mohit@gmail.com");
        obj.getData();
    }
}