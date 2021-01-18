package LanguageFamilies;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    Language(String language, int speakerCount, String locations, String syntax) {
        this.name = language;
        this.numSpeakers = speakerCount;
        this.regionSpoken = locations;
        this.wordOrder = syntax;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers +  " people mainly in " + this.regionSpoken + "." +
                " The language follows the word order: " + this.wordOrder + ".");
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers +  " people mainly in " + this.regionSpoken + "." +
                " The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {

    }
}