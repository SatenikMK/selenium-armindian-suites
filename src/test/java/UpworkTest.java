import org.testng.annotations.Test;

public class UpworkTest extends BaseSelenium {
    @Test
    public void test(){
        Upwork upwork = new Upwork();
        upwork.searchFreelancer();
    }
}
