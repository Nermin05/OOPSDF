package entities;

public class Starbucks extends CafeShop{//subclass


    public Starbucks(int ID, String name, String surname, String password, String email, String username, String number) {
        super(ID, name, surname, password, email, username);
        this.number = number;
    }
public Starbucks() {

}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;
}
