package io.cjc.jcartsupportback.mq;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-20 19:24
 **/
public class EmailEvent {
    private String toEmail;
    private String title;
    private String content;

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
