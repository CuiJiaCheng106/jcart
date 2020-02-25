package io.cjf.jcartadministrationback.dto.in;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 14:31
 **/
public class CustomerSearchInDTO {
    private String username;
    private String realName;
    private String mobile;
    private String email;
    private Byte status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
