import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WeatherReader {
    public void checkFileExists(File file) throws WeatherFileNotFoundException {
        if (!file.exists()) {
            throw new WeatherFileNotFoundException("File not found: " + file);
        }
    }
    public void readFile(File file){
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
           scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + file);
            e.printStackTrace();
        }
    }
    public void processWeatherFile(String file){
        File f= new File("/Users/sherafgantareen/Desktop/WeatherAppLab/src/weather.rtf");
        try{
            checkFileExists(f);
            readFile(f);
        }
        catch(WeatherFileNotFoundException e){System.out.println (e.getMessage());
        e.printStackTrace();}
    }
}
