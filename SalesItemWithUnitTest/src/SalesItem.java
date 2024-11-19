import java.util.ArrayList;
import java.util.List;

public class SalesItem {
  private String itemName;
  private double price;
  private List<Comment> comments;

  public SalesItem(String itemName, double price) {
    this.itemName = itemName;
    this.price = price;
    this.comments = new ArrayList<>();
  }

  public void addComment(String author, String text, int rating) {
    if (rating < 1 || rating > 5) {
      throw new IllegalArgumentException("Rating harus antara 1 dan 5.");
    }
    comments.add(new Comment(author, text, rating));
  }

  public int getNumberOfComments() {
    return comments.size();
  }

  public List<Comment> getComments() {
    return new ArrayList<>(comments);
  }

  public String getItemName() {
    return itemName;
  }

  public double getPrice() {
    return price;
  }
}
