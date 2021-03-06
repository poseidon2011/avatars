package com.wlgdo.avatar.web;


import com.wlgdo.avatar.web.listenner.ApplicatonCloseEventListener;
import com.wlgdo.avatar.web.listenner.ApplicatonStartEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AvatarWebAppApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AvatarWebAppApplication.class);

        application.addListeners(new ApplicatonStartEventListener());
        application.addListeners(new ApplicatonCloseEventListener());
        application.run(args);
    }

}
