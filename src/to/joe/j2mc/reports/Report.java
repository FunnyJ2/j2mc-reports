package to.joe.j2mc.reports;

import org.bukkit.Location;

public class Report {

    /**
     * A single report.
     * 
     */
    private int id;
    private final String message, username;
    private final Location location;
    private final long time;
    private final boolean closed;

    public Report(int ID, Location loc, String User, String Message, long time, boolean closed) {
        this.id = ID;
        this.location = loc;
        this.username = User;
        this.message = Message;
        this.time = time;
        this.closed = closed;
    }

    /**
     * @return is the report closed?
     */
    public boolean closed() {
        return this.closed;
    }

    /**
     * @return report's id
     */
    public int getID() {
        return this.id;
    }

    /**
     * @return location of the report
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * @return the report's contents
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return time of report
     */
    public long getTime() {
        return this.time;
    }

    /**
     * @return the username who reported
     */
    public String getUser() {
        return this.username;
    }

    /**
     * Update the ID. DO NOT TOUCH.
     * 
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

}
