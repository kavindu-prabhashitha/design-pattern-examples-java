package builderDesignPattern_Car;

public class Car {
    private final String insurance;
    private final Boolean etc;
    private final String roadAssistance;
    private final String dropOffLocation;

    public Car(Builder builder){
        this.insurance = builder.insurance;
        this.dropOffLocation = builder.insurance;
        this.roadAssistance = builder.roadAssistance;
        this.etc = builder.etc;
    }

    static class Builder {
        private  String insurance;
        private  Boolean etc;
        private String roadAssistance;
        private String dropOffLocation;

        public Builder(String insurance){
            //if insurance is a must
            this.insurance = insurance;
        }

        public Car build(){
            return new Car(this);
        }

        public Builder etc(Boolean etc){
            this.etc = etc;
            return this;
        }

        public Builder roadAssistance(String roadAssistance){
            this.roadAssistance = roadAssistance;
            return this;
        }

        public Builder dropOffLocation(String dropOffLocation){
            this.dropOffLocation = dropOffLocation;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Builder{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                '}';
    }
}
