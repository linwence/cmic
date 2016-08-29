package com.el.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Vincent on 2016/8/29.
 * jde 连接的配置文件信息
 */
@Component
public class JdeConfigInfo {
    @Value("${ojdbc.username}")
    private String userName;
    @Value("${ojdbc.password}")
    private String password;
    @Value("${jde.env}")
    private String jdeEnv;
    @Value("*ALL")
    private String jdeRole;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdeEnv() {
        return jdeEnv;
    }

    public void setJdeEnv(String jdeEnv) {
        this.jdeEnv = jdeEnv;
    }

    public String getJdeRole() {
        return jdeRole;
    }

    public void setJdeRole(String jdeRole) {
        this.jdeRole = jdeRole;
    }
}
