package week5lecture;

//**********************************************************************
//  Name.java
//
//  Represents the full name of a person.
//**********************************************************************

public class Name {
    private String first, middle, last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    public boolean equals(Name otherName) {
        return this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
    }

    public String initials() {
        String firstLetters;
        firstLetters = first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
        return firstLetters.toUpperCase();

        //return (first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1)).toUpperCase();
    }

    public int length() {
        return first.length() + middle.length() + last.length();
    }
}
