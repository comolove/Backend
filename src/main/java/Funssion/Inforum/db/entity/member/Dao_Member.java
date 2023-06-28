package Funssion.Inforum.db.entity.member;

// 상속을 이용하여 Social 로그인 Member, Non Social 로그인 Member 분리
public class Dao_Member {
    //user_id는 setter getter 설정을 하지 않는다. -> 어차피 jdbc template으로 최근 PK값 가져오기 때문이다.
    private long user_id;
    private String user_name;
    private int login_type; // login_type:0 = non-social, login_type:1 = social
    private String user_createdAt;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getLogin_type() {
        return login_type;
    }

    public void setLogin_type(int login_type) {
        this.login_type = login_type;
    }

    public String getUser_createdAt() {
        return user_createdAt;
    }

    public void setUser_createdAt(String user_createdAt) {
        this.user_createdAt = user_createdAt;
    }


}
