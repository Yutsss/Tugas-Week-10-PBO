import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SalesItemTest {

  @Test
  public void testAddComment() {
    SalesItem item = new SalesItem("Tablet", 300.0);
    item.addComment("David Smith", "Amazing quality!", 5);
    assertEquals(1, item.getNumberOfComments());
  }

  @Test
  public void testAddInvalidComment() {
    SalesItem item = new SalesItem("Tablet", 300.0);
    assertThrows(IllegalArgumentException.class, () -> item.addComment("Emily Brown", "Poor design", 0));
  }

  @Test
  public void testGetComments() {
    SalesItem item = new SalesItem("Headphones", 120.0);
    item.addComment("Sarah Johnson", "Comfortable and great sound", 4);
    item.addComment("Michael Lee", "Average experience", 3);

    List<Comment> comments = item.getComments();

    assertEquals(2, comments.size());
    assertEquals("Sarah Johnson", comments.get(0).getAuthor());
    assertEquals("Comfortable and great sound", comments.get(0).getText());
  }
}
