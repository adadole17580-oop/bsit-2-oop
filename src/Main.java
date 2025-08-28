import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PostManager pm = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");

        String postTitle = "Java Programming Tips";
        int engagementScore = pm.calculateEngagement(150, 75, 25); 
        String category = pm.getCategoryRating(engagementScore);

        pm.displayPostStats(postTitle, engagementScore, category);

        System.out.println();
        System.out.println("Unique Hashtags: " +
                pm.manageHashtags(new String[]{"#java", "#coding", "#programming", "#java", "#tips"}));

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Java Programming Tips", engagementScore);
        engagements.put("Advanced Java Tutorial", 1500);
        engagements.put("Spring Boot Guide", 800);

        System.out.println("Trending Posts: " + pm.findTrendingPosts(posts, engagements));
        System.out.println("Unique Authors: " + pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob"));
    }
}
