package animalshelter;

import java.util.List;

public class Visitor extends Person {

    private String personalCode;
    private int yearOfBirth;
    private List<String> wishList;

    private Staff staff;

    public Visitor(String firstName, String  surName) {
        super(firstName,surName);
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public int getNumberOfWishes(){
        return this.wishList.size();
    }

    public void addToWishList(String wish){
        wishList.add(wish);
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
