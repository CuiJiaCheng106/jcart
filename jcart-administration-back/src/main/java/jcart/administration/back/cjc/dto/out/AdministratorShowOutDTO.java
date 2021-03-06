package jcart.administration.back.cjc.dto.out;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 13:49
 **/
public class AdministratorShowOutDTO {
    private Integer administratorId;
    private  String username;
    private String email;
    private String avatarUrl;
    private Byte status;
    private String realName;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setRealName(String realName) {
    }
}
