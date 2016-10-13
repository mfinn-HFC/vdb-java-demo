package enums;

/**
 * Created by matt-hfc on 10/13/16.
 */
public enum URLS {
    BASE_STAGING("http://vdb-stage.herokuapp.com/");

    String URL;

    URLS(String URL) {
        this.URL = URL;
    }

    public String getString() {
        return URL;
    }
}
