public class Phonebook {
    String name;
    int phone_number;

    public Phonebook(String name, int phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "name='" + name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
