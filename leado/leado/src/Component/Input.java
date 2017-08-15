package Component;

/**
 * Created by Rajat Gupta on 15-Aug-17.
 */
public class Input {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String contact;
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    private String another_contact;
    public String getAnother_contact() {
        return another_contact;
    }

    public void setAnother_contact(String another_contact) {
        this.another_contact = another_contact;
    }

    private long cart_total;
    public long getCart_total() {
        return cart_total;
    }
    public void setCart_total(long cart_total) {
        this.cart_total = cart_total;
    }

    private int cart_items;
    public int getCart_items() {
        return cart_items;
    }
    public void setCart_items(int cart_items) {
        this.cart_items = cart_items;
    }
}
