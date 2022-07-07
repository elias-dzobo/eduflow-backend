package eduflow.eduflow.models;

public class Category {

    private Integer category_id;
    private String category;
    private String icon;

    public Category(String category, String icon) {
        this.category = category;
        this.icon = icon;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
