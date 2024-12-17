public class WeatherFileNotFoundException extends Exception {
    //Constructor that takes a custom error message
    public WeatherFileNotFoundException(String message) {
        super(message); // invoke the parent constructor with the message
    }
}
