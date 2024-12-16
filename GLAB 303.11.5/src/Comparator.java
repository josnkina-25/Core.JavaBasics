public abstract class Comparator {
    String cities_one;
    String cities_two;

    public Comparator(String cities_one, String cities_two) {
        this.cities_one = cities_one;
        this.cities_two = cities_two;
    }

    public String getCities_one() {
        return cities_one;
    }

    public void setCities_one(String cities_one) {
        this.cities_one = cities_one;
    }

    public String getCities_two() {
        return cities_two;
    }

    public void setCities_two(String cities_two) {
        this.cities_two = cities_two;
    }
}
