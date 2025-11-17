package nested_classes;

public class Humen {

    private Passport passport;
    private Hearth hearth;

    public Humen(String numder, PassportType passportType, String serial, double weight) {
        this.passport = new Passport(numder, passportType, serial);
        this.hearth = new Hearth(weight);
    }

    public static class Passport{
        private String serial;
        private String numder;
        private PassportType passportType;

        public Passport(String numder, PassportType passportType, String serial) {
            this.serial = serial;
            this.numder = numder;
            this.passportType = passportType;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "numder='" + numder + '\'' +
                    ", serial='" + serial + '\'' +
                    ", passportType=" + passportType +
                    '}';
        }
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Humen{" +
                "passport=" + passport +
                ", hearth=" + hearth +
                '}';
    }

    public class Hearth{
        private double weight;

        public Hearth(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Hearth{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
