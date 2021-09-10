package workshop1Demos;

public class IMDBApp {
    public static void main(String[] args) {
        String actorName = "Leonardo DiCaprio";
        int yearOfBorn = 1974;
        int age = 2021 - yearOfBorn;
        String[] movieTitles = {"Inception", 
                                "Djancho Unchained",
                                "The Wolf of Wall Street",
                                "The Departed"
                                };

        float[] movieRatings = { 8.8F,
                                 8.4F,
                                 8.2F,
                                 8.5F
                                };

        System.out.println("Actor's name: " + actorName);
        System.out.println("Born: " + yearOfBorn + " (" + age + " years old)");

        System.out.println("Movies:");

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));
        }
    }

    static String getRating(float rating) {
        if (rating <= 5.0) {
            return "bad";
        } 
        else if (rating > 5.0 && rating <= 6.5) {
            return "average";
        } 
        else if (rating > 6.5 && rating <= 7.0) {
            return "good";
        } 
        else if (rating > 7.0 && rating <= 8.0) {
            return "very good";
        } 
        else {
            return "amazing";
        }
    }
}
