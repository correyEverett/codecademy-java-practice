package LanguageFamilies;

public class SinoTibetan extends Language {

    SinoTibetan(String language, int speakerCount) {

        super(language, speakerCount, "Asia","subject-object-verb");
        if(language.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }

    }

}