package testingSpring.BasicForm;

import jakarta.validation.constraints.*;
import testingCustomAnnotations.CourseCode;


public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName;
    private String country;
    @Min(value = 1,message = "must be greater than or equal 1")
    @Max(value = 10,message = "must be less than or equal 10")
    private int freePasses;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
    @CourseCode(value = "Spring",message = "must start with Spring")
    private String courseCode;
    public Customer(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
