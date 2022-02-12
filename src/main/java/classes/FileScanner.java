package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileScanner {
    //  (probably) all eng prepositions
    List<String> prepositions = new ArrayList<>(Arrays.asList(
            "aboard", "about", "above", "across", "after", "against", "along",
            "amid", "among", "around", "as", "at", "before", "behind", "below",
            "beneath", "beside", "between", "beyond", "but", "by", "concerning",
            "considering", "despite", "down", "during", "except", "except",
            "following", "for", "from", "in", "inside", "into", "like", "minus",
            "near", "next", "of", "off", "on", "onto", "opposite", "out", "outside",
            "over", "past", "per", "plus", "regarding", "round", "save", "since", "than",
            "through", "to", "toward", "under", "underneath", "unlike", "until", "up",
            "upon", "versus", "via", "with", "within", "without")
    );
    // add articles
    //in English there are three articles: a, an, and the

    public static void main(String[] args) {
        // TODO
        // add methods
        // most frequent word -> done
        // the most rare word
        // words without prepositions -> get prepositions -> done
        // ‘with’, ‘at’, ‘by’, ‘to’, ‘in’, ‘for’, ‘from’, ‘of’, ‘on’.
        try {
            File file = new File("Tales from Dickens by Charles Dickens and Hallie Erminie Rives.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Integer> wordsAndFrequency = new HashMap<>();
            int wordsCounter = 0;
            int lim = 6; //  && lim-- > 0
            while (scanner.hasNextLine()) { //return true or false
                // String result = yourString.replaceAll("[-+.^:,]","");
                // .replaceAll("[^а-яА-Я0-9 a-zA-Z]", "")
                //.replaceAll("['!\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~]", "")
                //.replaceAll("( +)"  delete 2 or more spaces with single space in string
                String temp0 = scanner.nextLine().trim().replaceAll("( +)", " ");
                String temp = temp0.toLowerCase().replaceAll("[^\\w\\s]", "");
                if ("".equals(temp) || temp.length() < 2) {
                    continue;
                }
                String[] words = temp.split(" "); //return every string
                //System.out.println("line " + (++i) + " has " + (line.split(" ").length) + " words");
                //wordsCounter += words.length;

                if (words.length == 0) {
                    continue;
                }
//                System.out.println(Arrays.toString(words));
                for (String word : words) {
//                    without this if
//                    the file contains 110399 words
//                    wordsAndFrequency.size() = 7980
//                    with -> 90237 words, wordsAndFrequency.size() = 7888
                    if (word == null || "".equals(word) || word.length() < 3) {
                        continue;
                    }
                    wordsCounter++;
                    wordsAndFrequency.merge(word, 1, Integer::sum);
                }
            }
            System.out.println("the file contains " + wordsCounter + " words");
//            System.out.println(wordsAndFrequency);
            String maxKey = Collections.max(wordsAndFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();
//            long count = wordsAndFrequency.keySet().stream().filter(key -> key.equals(maxKey)).count();
//            System.out.println(count);
            System.out.println(maxKey + " " + wordsAndFrequency.get(maxKey));
            scanner.close();
        } catch (FileNotFoundException exception) {
            // Handle the situation by letting the user know what happened
            System.out.println("Cannot find this file!");

        }
    }
}
