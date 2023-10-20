package sol;


/**
 * SongOfThe2000s class with two fields: the name of the songs and their listenerCounts
 */
public class SongOfThe2000s {

    private String name;
    private double listenerCount;

    /**
     * Constructor for a SongOfThe2000s
     * @param name
     * @param listenerCount
     */
    public SongOfThe2000s(String name, double listenerCount) {
        this.name = name;
        this.listenerCount = listenerCount;
    }

    /**
     * Getter method for the listenerCount of a song
     * @return the name of a song
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method for the listenerCount of a song
     * @return the listenerCount of a song
     */
    public double getListenerCount() {
        return this.listenerCount;
    }
}


