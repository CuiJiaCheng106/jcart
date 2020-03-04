package jcart.administration.back.cjc.dto.out;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 13:45
 **/
public class AdministratorListOutDTO {
    private Integer administratorId;
    private String username;
    private Byte status;
    private Long createTimestamp;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setRealName(String realName) {
    }
}
