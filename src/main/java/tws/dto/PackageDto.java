package tws.dto;

public class PackageDto {

        private String trackingNumber;
        private String addressee;
        private String telephone;
        private String weight;
        private String state;
        private String dateTime;
        private String key;

        public PackageDto(String trackingNumber, String addressee, String telephone, String weight, String state, String dateTime) {
            this.trackingNumber = trackingNumber;
            this.addressee = addressee;
            this.telephone = telephone;
            this.weight = weight;
            this.state = state;
            this.dateTime = dateTime;
        }

        public PackageDto() {
        }

    public PackageDto(String trackingNumber, String addressee, String telephone, String weight, String state, String dateTime, String key) {
        this.trackingNumber = trackingNumber;
        this.addressee = addressee;
        this.telephone = telephone;
        this.weight = weight;
        this.state = state;
        this.dateTime = dateTime;
        this.key = key;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PackageDto{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", addressee='" + addressee + '\'' +
                ", telephone='" + telephone + '\'' +
                ", weight='" + weight + '\'' +
                ", state='" + state + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
