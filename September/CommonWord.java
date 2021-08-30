import java.util.*;


public class CommonWord {
    public static void main(String [] args){

        String paragraph = "abc abc? abcd the jeff!";
        String[] banned = {"abc","abcd","jeff"};

        // dictionary of existed words with its amount
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("\\W+");

        Set<String> bannedWords = new HashSet();
        for (String word:banned){
            bannedWords.add(word);
        }
        Map <String,Integer> dictionary = new HashMap<>();

        for(String word:words){
            if(!bannedWords.contains(word)){
                dictionary.put(word,dictionary.getOrDefault(word,0)+1);
            }
        }
       System.out.println(Collections.max(dictionary.entrySet(),Map.Entry.comparingByValue()).getKey());

    }
}

