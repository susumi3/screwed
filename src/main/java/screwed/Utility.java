package screwed;

import screwed.model.Options;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public class Utility {

    public static String genPassword(Options options) {
        String tmp = "";

        if (options.upper()) {
            tmp += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (options.lower()) {
            tmp += "abcdefghijklmnopqrstuvwxyz";
        }
        if (options.number()) {
            tmp += "1234567890";
        }
        tmp += options.symbols();

        StringBuilder pass = new StringBuilder(options.size());
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < options.size(); i++) {
            pass.append(tmp.charAt(random.nextInt(tmp.length())));

        }

        return pass.toString();
    }

    public static void writeFile(String path, String str) {

        try {
            File file = new File(path);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(str+"\n");
            bufferedWriter.close();

        }catch (IOException e) {
            System.err.print(e.getMessage());

        }

    }

}
