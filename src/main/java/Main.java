import model.Defender;
import model.Player;
import model.Striker;

import java.io.*;
import java.util.List;

/**
 * Calculo de complexidade ciclomática:
 * Todos os métodos iniciam com 1, caso seja sequencial, permanece em 1.
 * Na presença de condicional, adicionaremos 1 para cada com exceção do else.
 **/

public class Main {

    static FileInputStream is;
    static DataInputStream data;
    static BufferedReader reader;


    /**
     * Complexidade ciclomática deste método é 2, pois apresenta o try catch, sendo assim, há a possibilidade
     * de ele cair na clausula de catch. O finally não conta, pois em ambos os casos irá para ele, portanto, faz parte
     * de um ciclo sequencial.
     */
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

    /**
     * A complexidade desse método é 3, pois apresenta 1 fluxo (while) e 1 condicional (if). Else não conta pontos.
     */
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


    /**
     * A complexidade desse método é 1, pois é um código sequencial. Não contaremos a complexidade das funções.
     */
    private static void checkOffside() throws IOException {
        List<Striker> strikers = Striker.create(reader.readLine());
        List<Defender> defenders = Defender.create(reader.readLine());
        Player.verifyIfTheresOffsidePlayer(strikers, defenders);
    }

    /**
     * A complexidade desse método é 2. Apesar de não apresentar if, ele utiliza 1 operador ternário de checagem única
     * condition ? answer 1 : answer 2, o que garante um ponto adicional.
     */
    private static void initStreams(String[] args) throws FileNotFoundException {
        is = new FileInputStream((args.length >= 1) ? args[0] : "Teste.txt");
        data = new DataInputStream(is);
        reader = new BufferedReader(new InputStreamReader(data));
    }

    /**
     * Complexidade é 1, devido ao fluxo sequencial
     */
    private static void closeStreams() throws IOException {
        reader.close();
        data.close();
        is.close();
    }
}