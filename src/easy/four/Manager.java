package easy.four;

class Manager extends Employee {

    Manager(String name, int id) {
        super(name, id);   // call Employee constructor
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}