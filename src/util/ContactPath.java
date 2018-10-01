package util;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;

public class ContactPath {

    //creates the path
    public static List<String> listCreator (String filepath) {
        List<String> data = new ArrayList<>();
        try {
            Path p = Paths.get(filepath);
            data = Files.readAllLines(p);
        } catch (IOException e) {
            System.out.println("listCreator, Something went wrong.");
            e.printStackTrace();
            System.exit(1);
        }
        return data;
    }

    //Creates the file
    public static void listHolder (String filename, List<String> contents) {
        try{
            Files.write(Paths.get(filename), contents,StandardOpenOption.CREATE);

        } catch (IOException e) {
            System.out.println("listHolder, something went wrong");
        }
    }

    //Makes the arraylist needed for the file
    public static void makeItSo(String filename){
        List<String> arrList = new ArrayList<>();
        for(String x :listCreator(filename)) {
            arrList.add(x.toUpperCase() + ".");
        }
        listHolder(filename + ".ContactManager", arrList);
    }

    public static void main(String[] args) {
        List<String> tester = Arrays.asList("#1", "#2", "#3");
        listHolder("tester1", tester);
        listCreator("tester1");

        for(String x: listCreator("tester1")){
            System.out.println(x);
        }
    }
}
