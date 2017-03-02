import com.score.bowling.FileUtil;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            System.err.println("Please enter file name in command line");
            System.exit(1);
        }

        FileUtil bowlingScore = new FileUtil(args[0]);
        for( String answer : bowlingScore.process()){
            System.out.println(answer);
        }
    }
}
