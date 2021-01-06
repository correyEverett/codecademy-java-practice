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

        int indexB = desertIslandPlaylist.indexOf("Confessions");
        System.out.println("\nConfessions is located at index " + indexB);
        System.out.println();

        // Create a temporary variable to store the value of a song.
        String tempA = desertIslandPlaylist.get(3);
        String tempB = desertIslandPlaylist.get(0);
        // Rewrite the value at the index of a to the value of b.
        desertIslandPlaylist.set(3, tempB);


    }

}