package Lecture_4;

import java.text.MessageFormat;

public class Experiment {
    public static void main(String[] args) {
        String formatString = "there were {0} {0,choice,0#objects|1#object|1<objects}";
        MessageFormat fmt = new MessageFormat(formatString);
        System.out.println(fmt.format(new Object[] {(long)21}));
    }

}
