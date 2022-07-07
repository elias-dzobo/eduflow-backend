package eduflow.eduflow.models;

import java.sql.Date;

public class Replies {

    private int reply_id;
    private int question_id;
    private int user_id;
    private String reply;
    private Date created_at;
    private Date updated_at;

    public Replies(int question_id, int user_id, String reply) {
        this.question_id = question_id;
        this.user_id = user_id;
    }


    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
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
