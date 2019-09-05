package tws.entity;

public class Package {
    private String trackingNumber;
    private String addressee;
    private String telephone;
    private String weight;
    private int state;
    private String dateTime;

    public Package(String trackingNumber, String addressee, String telephone, String weight, int state, String dateTime) {
        this.trackingNumber = trackingNumber;
        this.addressee = addressee;
        this.telephone = telephone;
        this.weight = weight;
        this.state = state;
        this.dateTime = dateTime;
    }

    public Package() {
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Package{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", addressee='" + addressee + '\'' +
                ", telephone='" + telephone + '\'' +
                ", weight='" + weight + '\'' +
                ", state=" + state +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
