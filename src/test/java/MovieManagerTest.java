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
        MoviePoster[] arr = mm.getMovieArray();
        mm.addNew(new MoviePoster("daynshot", "drama"));
        int act = arr.length;
        Assertions.assertEquals(6, act);
    }

    @Test
    public void findAllTest() {
        MoviePoster[] mps = mm.findAll();
    }

    @Test
    public void findAllReversedTest() {
        MoviePoster[] mps = mm.findLast();
    }

}
