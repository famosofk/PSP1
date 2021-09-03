import model.Defender;
import model.Player;
import model.Striker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static FileInputStream is;
    static DataInputStream data;
    static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        try {
            initStreams(args);
            handleInputFile();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeStreams();
        }
    }

    private static void handleInputFile() throws IOException {
        while (true) {
            String arguments = reader.readLine();
            if (arguments.equals("0 0")) {
                break;
            } else {
                checkOffside();
            }
        }
    }

    private static void checkOffside() throws IOException {
        List<Striker> strikers = Striker.create(reader.readLine());
        List<Defender> defenders = Defender.create(reader.readLine());
        Player.verifyIfTheresOffsidePlayer(strikers, defenders);
    }

    private static void initStreams(String[] args) throws FileNotFoundException {
        is = new FileInputStream("Teste.txt");
        data = new DataInputStream(is);
        reader = new BufferedReader(new InputStreamReader(data));
    }

    private static void closeStreams() throws IOException {
        reader.close();
        data.close();
        is.close();
    }

    private void mockList() {
        List<Striker> strikerList = new ArrayList<>();
        List<Defender> defenderList = new ArrayList<>();

        strikerList.add(new Striker(150));
        strikerList.add(new Striker(90));
        strikerList.add(new Striker(200));
        defenderList.add(new Defender(150));
        defenderList.add(new Defender(350));
        defenderList.add(new Defender(250));
        Player.verifyIfTheresOffsidePlayer(strikerList, defenderList);
    }
}
