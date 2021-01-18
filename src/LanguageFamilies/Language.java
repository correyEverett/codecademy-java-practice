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

}