package io.cjc.jcartsupportback.util;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-03-19 18:50
 **/

@Component
public class EmailUtil {

    @Autowired
    private JavaMailSender mailSender;

    private Logger logger= (Logger) LoggerFactory.getLogger(this.getClass());


    public void send(String fromEmail,String toEmail,String title,String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject(title);
        message.setText(content);
        mailSender.send(message);
        logger.info("send email ended");
    }


}
