public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public void addfilm(String film) {
            String[] tmp = new String[films.length +1];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[i];
            }
            tmp[tmp.length - 1] = film;
            films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public FilmManager(){
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public String[] findLast() {
        int posterLength;
        if (limit <= films.length) {
            posterLength = limit;
        } else {
            posterLength = films.length;
        }
        String[] tmp = new String[posterLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
