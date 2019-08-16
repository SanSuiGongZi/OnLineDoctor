package com.example.wayne.dentist.bean;

/**
 * @name 张东
 * @time 2019/8/14  17:48
 * @describe        手机号登录
 */
public class LoginBean {
    /**
     * result : 1
     * msg : 登录成功
     * token : 6505f0f211e5b3e5e7120c6f05ef9f50
     * uid : 145
     * username : 18234830743
     * cpy_id : 0
     */

    private int result;
    private String msg;
    private String token;
    private int uid;
    private String username;
    private int cpy_id;

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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCpy_id() {
        return cpy_id;
    }

    public void setCpy_id(int cpy_id) {
        this.cpy_id = cpy_id;
    }
}
