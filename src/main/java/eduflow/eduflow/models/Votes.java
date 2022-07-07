package eduflow.eduflow.models;

public class Votes {
    private int user_id;
    private int replies_id;

    public Votes(int user_id, int replies_id) {
        this.user_id = user_id;
        this.replies_id = replies_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getReplies_id() {
        return replies_id;
    }

    public void setReplies_id(int replies_id) {
        this.replies_id = replies_id;
    }
}
