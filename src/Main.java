import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherReader weatherReader = new WeatherReader();
        weatherReader.processWeatherFile("/Users/sherafgantareen/Desktop/WeatherAppLab/src/weather.rtf");
        Scanner scanner = new Scanner(System.in);
        //weatherReader.processWeatherFile("/Users/sherafgantareen/Desktop/WeatherAppLab/src/weather.rtf");
    }
}
