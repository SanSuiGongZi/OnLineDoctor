package com.example.wayne.dentist.bean;

/**
 * @name 张东
 * @time 2019/8/14  17:12
 * @describe
 */
public class RegisterBean {
    /**
     * result : 1
     * msg : 注册成功
     * token :
     */

    private int result;
    private String msg;
    private String token;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
