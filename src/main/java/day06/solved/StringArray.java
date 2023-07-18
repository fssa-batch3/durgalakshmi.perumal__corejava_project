package day06.solved;
import java.util.ArrayList;

public class StringArray {

    public static void main(String[] args) {

        ArrayList<String> cityArr = new ArrayList<>();
        cityArr.add("Chennai");
        cityArr.add("Bangalore");
        cityArr.add("Mumbai");

        cityArr.set(0, "Kolkata");

        String newPlace = "kerala";
        cityArr.add(newPlace);

        String delete = "Bangalore";
        cityArr.remove(delete);

        for (String cityName : cityArr) {
            System.out.println(cityName);
        }
    }

}
