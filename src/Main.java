import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args)  {

        String[] words = FileHangling.fileReading();

        Game.game(words);

        FileHangling.writingWordFiel(words);

    }
}




