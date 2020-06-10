import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("GSON");
        //read JSON and loop through players
        String jsonFile = "data/players.json";
        Gson gson = new Gson();
        FileReader fileReader = new FileReader(jsonFile);
        JsonReader jsonReader = new JsonReader(fileReader);

        ReadJson[] data = gson.fromJson(jsonReader,ReadJson[].class);

        List<Player> playerList = new ArrayList<Player>();

        for(ReadJson readJson : data){
            System.out.println(readJson.getFirstName() + " " + readJson.getLastName());
            playerList.add(new Player(readJson.getFirstName(), readJson.getLastName(),0));
        }
        for (Player thePlayer: playerList){
            System.out.println("first name (in_list) = " + thePlayer.firstName);
        }
    }
}
