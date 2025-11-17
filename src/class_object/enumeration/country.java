package class_object.enumeration;

public enum country {
        JAPAN("Японський", 127_000_00l, "Японія"),
        CREECE("Гречка", 10_000_00l, "Греція"),
        ARGENTINA("Інспаньский", 47_000_00l, "Аргентина");
        private String name;
        private long peopleCountry;
        private String language;

    country(String language, long peopleCountry, String name) {
        this.language = language;
        this.peopleCountry = peopleCountry;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public long getPeopleCountry() {
        return peopleCountry;
    }
    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "country{" + "\n" +
                "name='" + name + '\'' +
                ", peopleCountry=" + peopleCountry +
                ", language='" + language + '\'' +
                '}' + "\n";
    }
}
