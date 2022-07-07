package eduflow.eduflow.models;

import java.sql.Date;

public class Questions {

    private Integer question_id;
    private int user_id;
    private int category_id;
    private String title;
    private String text;
    private Date created_at;
    private Date updated_at;

    public Questions(int user_id, int category_id, String title, String text, Date created_at, Date updated_at) {
        this.user_id = user_id;
        this.category_id = category_id;
        this.title = title;
        this.text = text;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
