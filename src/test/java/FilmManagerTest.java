import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void shouldAddFilms() {
        FilmManager manager = new FilmManager();
        manager.addfilm("film1");
        manager.addfilm("film2");
        manager.addfilm("film3");
        manager.addfilm("film4");
        manager.addfilm("film5");
//        manager.addfilm("film6");
//        manager.addfilm("film7");
//        manager.addfilm("film8");
//        manager.addfilm("film9");
//        manager.addfilm("film10");
//        manager.addfilm("film11");
//        manager.addfilm("film12");
//        manager.addfilm("film13");
//        manager.addfilm("film14");
//        manager.addfilm("film15");
//        manager.addfilm("film16");
//        manager.addfilm("film17");
        String[] act = manager.findAll();
        String[] exp = {"film1", "film2", "film3", "film4", "film5"};

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldLastAddFilmsWithLimit() {
        FilmManager manager = new FilmManager(3);
        manager.addfilm("film1");
        manager.addfilm("film2");
        manager.addfilm("film3");
        manager.addfilm("film4");
        manager.addfilm("film5");
        manager.addfilm("film6");
        manager.addfilm("film7");
        manager.addfilm("film8");
        manager.addfilm("film9");
        manager.addfilm("film10");
        manager.addfilm("film11");
//        manager.addfilm("film12");
        manager.addfilm("film13");
//        manager.addfilm("film14");
        manager.addfilm("film15");
//        manager.addfilm("film16");
        manager.addfilm("film17");

        String[] act = manager.findLast();
        String[] exp = {"film17", "film15", "film13"};

        Assertions.assertArrayEquals(exp, act);
    }
}
