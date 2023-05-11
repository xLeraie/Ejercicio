public class EjercicioOB {
    public static void main (String[] args) {
        Person programador = new Person();
        programador.setName("Adonis");
        programador.setAge(23);
        programador.setPhoneNumber(122333);

        System.out.println(programador.getName());
        System.out.println(programador.getAge());
        System.out.println(programador.getPhoneNumber());
    }
}

class Person {

    // Datos de la persona
    private String name;
    private int age;
    private int phoneNumber;

    // Getters y Setters

    public void setName (String name) {   
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return this.age;
    }

    public void setPhoneNumber (int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber () {
        return this.phoneNumber;
    }
}