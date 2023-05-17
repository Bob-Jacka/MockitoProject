import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.stats.MovieManager;
import ru.netology.stats.MoviePoster;


public class MovieManagerTest {
    MovieManager mm = new MovieManager(100_000_000);
    MoviePoster mp1 = new MoviePoster("Bladshot", "action");
    MoviePoster mp2 = new MoviePoster("gunshot", "melodrama");
    MoviePoster mp3 = new MoviePoster("mustshot", "dorama");
    MoviePoster mp4 = new MoviePoster("goneshot", "sport");
    MoviePoster mp5 = new MoviePoster("guanjong", "chess");
    MoviePoster mp6 = new MoviePoster("shouldshot", "tvSerial");

    @BeforeEach
    public void addNeeded() {
        mm.addNew(mp1);
        mm.addNew(mp2);
        mm.addNew(mp3);
        mm.addNew(mp4);
        mm.addNew(mp5);
        mm.addNew(mp6);
    }

    @Test
    public void addNew() {
        int exp = 6;

        MoviePoster[] arr = mm.getMovieArray();
        int act = arr.length;

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void notNull() {
        Assertions.assertNotNull(mm);
    }

    @Test
    public void findAllMovieNameTest() {
        String exp = "Bladshot";

        String act = mm.findAll()[0].getMovieName();

        Assertions.assertEquals(exp, act);

    }

    @Test
    public void findAllMovieGenreTest() {
        String exp = "action";

        String act = mm.findAll()[0].getGenre();

        Assertions.assertEquals(exp, act);

    }

    @Test
    public void findAllReversedTest() {
        String exp = "shouldshot";

        String act = mm.findLast()[0].getMovieName();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void assertLength() {
        int exp = 1;

        MovieManager mm2 = new MovieManager(100_000_000);
        mm2.addNew(new MoviePoster("Bladshot", "action"));
        MoviePoster[] act = mm2.getMovieArray();

        Assertions.assertEquals(exp, act.length);
    }

    @Test
    public void assertEqualLimitTest() {
        long exp = 100_000_000;

        Assertions.assertEquals(exp, mm.getLimit());
    }

    @Test
    public void assertNotEqualLimit() {
        long exp = 100_000_000;

        MovieManager mm2 = new MovieManager(500);
        Assertions.assertNotEquals(exp, mm2.getLimit());
    }
}
