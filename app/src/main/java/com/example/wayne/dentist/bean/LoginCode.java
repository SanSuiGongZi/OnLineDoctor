package com.example.wayne.dentist.bean;

/**
 * @name 张东
 * @time 2019/8/1416:11
 * @describe
 */
public class LoginCode {
    /**
     * result : 1
     * msg : 发送成功
     * token :
     * sn : 56E05A23552C447B8A1274F4180CE4CF
     */

    private int result;
    private String msg;
    private String token;
    private String sn;

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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}
