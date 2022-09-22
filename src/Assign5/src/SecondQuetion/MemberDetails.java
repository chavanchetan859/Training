package SecondQuetion;

public class MemberDetails {
    public String name;
    public int regNo;
    public String address;

    public MemberDetails(String name, int regNo, String address) {
        this.name = name;
        this.regNo = regNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", address='" + address + '\'' +
                '}';
    }
}
