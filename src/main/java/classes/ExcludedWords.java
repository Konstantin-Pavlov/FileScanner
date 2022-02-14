package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ExcludedWords {
    //  (probably) all eng prepositions
    public static final List<String> PREPOSITIONS = new ArrayList<>(Arrays.asList(
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


    //in English there are three articles: a, an, and the
    public static final List<String> ARTICLES = new ArrayList<>(Arrays.asList(
            "a", "an", "the")
    );

    public static final List<String> CONJUNCTIONS = new ArrayList<>(Arrays.asList(
            "for", "and", "nor", "but", "or", "yet", "so", "because", "if", "although", "since",
            "until", "while", "as", "when", "before", "after", "once", "until", "whenever", "while",
            "where", "wherever", "if", "unless", "in case", "though", "whereas")
    );
}
