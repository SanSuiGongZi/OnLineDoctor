package com.example.wayne.dentist.base;

import com.example.wayne.dentist.bean.LoginBean;
import com.example.wayne.dentist.bean.LoginCode;
import com.example.wayne.dentist.bean.LoginUserBean;
import com.example.wayne.dentist.bean.RegisterBean;
import com.example.wayne.dentist.bean.RegisterCode;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.bean.TabSonBean;
import com.example.wayne.dentist.bean.TestBean;
import com.example.wayne.dentist.util.SpUtil;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public interface UrlPort {

    String token = (String) SpUtil.getParam(Constants.TOKEN, "96e5f099c35734a1a334b03b9e786bd6");
    String Url = "http://api.bats-bio.com/ajax/";

    /**
     * tab分类
     *
     * @param id
     * @param token
     * @return
     */
    @GET("knowledges/knowledge_types_list?")
    Observable<TabBean> getTabList(@Query("login_id") int id, @Query("token") String token, @Query("pid") int Pid);

    @GET("knowledges/knowledge_types_list?")
    Observable<TabSonBean> getTabSonList(@Query("login_id") int id, @Query("token") String token, @Query("pid") int Pid);

    /**
     * 测试接口数据
     *
     * @param id
     * @param token
     * @param tid
     * @return
     */
    @GET("knowledges/knowledges_list?")
    Observable<TestBean> getEncyData(@Query("login_id") int id, @Query("token") String token, @Query("tid") int tid);

    /**
     * 获取注册验证码
     *
     * @param phone
     * @return
     */
    @GET("login/send_msg_reg?")
    Observable<RegisterCode> getRegisterCode(@Query("tel") String phone);

    /**
     * 获取登录验证码
     *
     * @param phone
     * @return
     */
    @GET("login/send_msg_login?")
    Observable<LoginCode> getLoginCode(@Query("tel") String phone);

    /**
     * 用户注册接口
     *
     * @param sn
     * @param code
     * @param uTypeID
     * @param phone
     * @param password
     * @param imgUrl
     * @param sex
     * @param birthDay
     * @param email
     * @param uAddr
     * @param uMailAddr
     * @param uRemark
     * @param uGoods
     * @param uAuthImg
     * @return
     */
    @GET("login/users_reg?")
    Observable<RegisterBean> getRegister(@Query("sn") String sn, @Query("vcode") String code,
                                         @Query("uTypeID") int uTypeID,
                                         @Query("uTel") String phone,
                                         @Query("IUserPwd") String password,
                                         @Query("uImg") String imgUrl,
                                         @Query("uSex") String sex,
                                         @Query("uBirthday") String birthDay,
                                         @Query("uEmail") String email,
                                         @Query("uAddr") String uAddr,
                                         @Query("uMailAddr") String uMailAddr,
                                         @Query("uRemark") String uRemark,
                                         @Query("uGoods") String uGoods,
                                         @Query("uAuthImg") String uAuthImg);

    /**
     * 手机号登录接口
     *
     * @param phone
     * @param sn
     * @param code
     * @return
     */
    @GET("login/login_by_tel?")
    Observable<LoginBean> getLogin(@Query("tel") String phone, @Query("sn") String sn, @Query("vcode") String code);

    /**
     * 账号密码登录接口
     *
     * @param username
     * @param password
     * @return
     */
    @GET("login/login?")
    Observable<LoginUserBean> getUserLogin(@Query("username") String username, @Query("userpwd") String password);

}
