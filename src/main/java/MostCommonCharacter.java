import java.util.HashMap;
import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
    Map <Character, Integer> mostCom = new HashMap<>();
    for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        mostCom.put(c,mostCom.getOrDefault(c,0)+1);
    }

    char mostCommonChart='\0';
    int maxNum = 0;

    for(Map.Entry<Character,Integer> entry: mostCom.entrySet()){
        if (entry.getValue() > maxNum){
            mostCommonChart = entry.getKey();
            maxNum = entry.getValue();
        }
    }

    return mostCommonChart;
}
}
