package java111.week12;

public class Address implements Comparable<Address>
//step-1: add declaration here to implement Comparable<T> interface

//https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html

{

private String street;

private int houseNumber;




/**

Constructs an address.

@param aStreet the street name

@param aHouseNumber the house number

*/

public Address(String aStreet, int aHouseNumber)
{
street = aStreet;
houseNumber = aHouseNumber;
}
public String toString()
    {
    return houseNumber + " " + street;
    }
public String getStreet() {
    return street;
}
public void setStreet(String street) {
    this.street = street;
}
public int getHouseNumber() {
    return houseNumber;
}
public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
}

//step-2: add implementation of the compareTo() method here

public int compareTo(Address address){
//First compare the street names, if the street names are the same,
//then compare the house numbers.
//The compareTo() method should return an integer and has one parameter that accepts an Address object as the argument
return (!this.street.equals(address.getStreet())) ? this.getStreet().compareTo(address.getStreet()): this.getHouseNumber() - address.getHouseNumber();
}
}