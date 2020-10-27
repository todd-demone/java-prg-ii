
public class LitRecord {

    private String country;
    private String gender;
    private int year;
    private double literacyRate;

    public LitRecord(String country, String gender, int year, double literacyRate) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyRate;
    }

    

}
