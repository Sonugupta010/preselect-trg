package com.revature.day04.part2.question04;

public class DirectoryEntry {
    protected String name;
    protected String address;
    protected String telephoneNumber;
    protected String mobileNumber;
    protected String headOfFamily;
    protected String uniqueID;
    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getHeadOfFamily() {
        return headOfFamily;
    }
    public String getUniqueID() {
        return uniqueID;
    }
    public void displayEntry() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
    public boolean matchesKeyword(String keyword) {
        return name.contains(keyword) || address.contains(keyword) || telephoneNumber.contains(keyword)
                || mobileNumber.contains(keyword) || headOfFamily.contains(keyword) || uniqueID.contains(keyword);
    }
}
