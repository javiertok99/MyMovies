package sg.edu.rp.c346.mymovies;

public class MovieItems {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private String watched_on;
    private String in_theatre;
    private String desc;

    public MovieItems(String title, String year, String rated, String genre, String watched_on, String in_theatre, String desc) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(String watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String yearGen(String Year, String Genre){
        return "" + Year + " - "+ genre;
    }
}
