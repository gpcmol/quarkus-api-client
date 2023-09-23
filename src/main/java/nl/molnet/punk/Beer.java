package nl.molnet.punk;

public class Beer {
    public int id;
    public String name;
    public String tagline;
    public String first_brewed;
    public String description;
    public String image_url;
    public double abv;
    public double ibu;
    public double target_fg;
    public double target_og;
    public double ebc;
    public double srm;
    public double ph;
    public double attenuation_level;
    public Volume volume;
    public Volume boil_volume;
    public Method method;
    public Ingredients ingredients;
    public String[] food_pairing;
    public String brewers_tips;
    public String contributed_by;

    public static class Volume {
        public double value;
        public String unit;
    }

    public static class Method {
        public MashTemp[] mash_temp;
        public Fermentation fermentation;
        public Object twist;

        public static class MashTemp {
            public Temperature temp;
            public int duration;
        }

        public static class Fermentation {
            public Temperature temp;
        }

        public static class Temperature {
            public double value;
            public String unit;
        }
    }

    public static class Ingredients {
        public Malt[] malt;
        public Hop[] hops;
        public String yeast;

        public static class Malt {
            public String name;
            public Amount amount;
        }

        public static class Hop {
            public String name;
            public Amount amount;
            public String add;
            public String attribute;
        }

        public static class Amount {
            public double value;
            public String unit;
        }
    }
}
