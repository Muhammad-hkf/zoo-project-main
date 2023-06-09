package animalshelter;

import java.time.LocalDate;

public class Staff extends Person{

    private LocalDate startDate;
    private boolean student;

    public Staff(String firstName, String  surName) {
      super(firstName,surName);
    }

    public Staff(String firstName, String surName, LocalDate startDate, boolean student) {
        super(firstName, surName);
        this.startDate = startDate;
        this.student = student;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "startDate=" + startDate +
                ", student=" + student +
                '}';
    }
}
