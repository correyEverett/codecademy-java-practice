import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Confessions");
        desertIslandPlaylist.add("Coming of Age");
        desertIslandPlaylist.add("Dance with the Devil");
        desertIslandPlaylist.add("Love In This Club");
        desertIslandPlaylist.add("Renagade");
        desertIslandPlaylist.add("Charlene");
        System.out.println(desertIslandPlaylist);
        System.out.println();

        desertIslandPlaylist.remove("Charlene");

        // Get the indices of the songs you want to swap.
        int indexA = desertIslandPlaylist.indexOf("Love In This Club");
        System.out.println("Love In This Club is located at index " + indexA);
        System.out.println();


    }

}