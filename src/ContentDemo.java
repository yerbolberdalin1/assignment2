import javax.swing.text.AbstractDocument;
import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<ContentItem> items = new ArrayList<ContentItem>();
        items.add(new VideoLecture("hello",2023,5,"HD"));
        items.add(new VideoLecture("bad",2024,3,"4K"));
        items.add(new PodcastEpiosde("hgf",2000,10,"shsh"));
        items.add(new PodcastEpiosde("fgh",2001,8,"wwew"));
        int currentYear = java.time.Year.now().getValue();
        for(ContentItem item:items){
            System.out.println(item.toString() + " | licenseCost=" + item.getLicenseCost(currentYear));
            if (item instanceof Downloadable) {
                Downloadable downloadable1 = (Downloadable) item;
                downloadable1.download();
                System.out.println("Max downloads/day: " + downloadable1.getMaxDownloadsPerDay());
            }
        }
    }
}
