package com.example.wayne.dentist.bean;

import java.util.List;

/**
 * @name 张东
 * @time 2019/8/1311:40
 * @describe
 */
public class TestBean {
    /**
     * result : 1
     * msg :
     * token : 96e5f099c35734a1a334b03b9e786bd6
     * data : [{"id":18,"kCompanyID":1,"kTypeID":111,"kTypePath":"111","kTitle":"测试","kTitleImg":"http://api.bats-bio.com1","kContent":"<style type=\"text/css\">body:nth-of-type(1) .dhxtree_dhx_skyblue span.selectedTreeRow, body:nth-of-type(1) .dhxtree_dhx_skyblue span.selectedTreeRow_lor{background: #f00}<\/style><p><span class=\"l\"><em>视频<\/em><\/span>                <span class=\"r cur\"><em>GPS<\/em><\/span>                <a href=\"javascript:void(0);\" class=\"splite_close\"><em class=\"fa fa-angle-double-left\"><\/em><\/a><\/p>","kPath":"http://api.bats-bio.com1","kAddTime":"2019-07-31 09:37:48","kPcPath":"1","kWapPath":"2","cName":"官方诊所","tName":null},{"id":17,"kCompanyID":1,"kTypeID":112,"kTypePath":"1,15,22,112","kTitle":"牙膏分类","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564536457699034.jpg","kContent":"","kPath":"http://api.bats-bio.com","kAddTime":"2019-07-31 09:27:42","kPcPath":"ygfl","kWapPath":"ygflMobile","cName":"官方诊所","tName":"牙膏分类"},{"id":16,"kCompanyID":1,"kTypeID":88,"kTypePath":"8,32,36,88","kTitle":"龋齿文章","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564124174623736.jpg","kContent":"<p>龋齿文章内容<\/p>","kPath":"http://api.bats-bio.com","kAddTime":"2019-07-26 14:56:16","kPcPath":"","kWapPath":"","cName":"官方诊所","tName":"龋齿"},{"id":15,"kCompanyID":1,"kTypeID":36,"kTypePath":"8,32,36","kTitle":"龋齿","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564124138107947.jpg","kContent":"<p>龋齿文章<\/p>","kPath":"http://api.bats-bio.com/public/upload/course_files/zcbc.450e0c7.mp4","kAddTime":"2019-07-26 14:55:53","kPcPath":"","kWapPath":"","cName":"官方诊所","tName":"牙体疾病"},{"id":14,"kCompanyID":1,"kTypeID":86,"kTypePath":"8,32,35,86","kTitle":"牙龈文章","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564124096560912.jpg","kContent":"<p>牙龈文章<\/p>","kPath":"http://api.bats-bio.com","kAddTime":"2019-07-26 14:55:01","kPcPath":"","kWapPath":"","cName":"官方诊所","tName":"牙龈炎"},{"id":13,"kCompanyID":1,"kTypeID":35,"kTypePath":"8,32,35","kTitle":"牙龈","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564111161499909.jpg","kContent":"<p>牙龈知识介绍<\/p>","kPath":"http://api.bats-bio.com/public/upload/course_files/zcbc.450e0c7.mp4","kAddTime":"2019-07-26 11:20:05","kPcPath":"","kWapPath":"","cName":"官方诊所","tName":"牙周疾病"},{"id":12,"kCompanyID":1,"kTypeID":4,"kTypePath":"1,4","kTitle":"牙齿结构","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564107108594652.jpg","kContent":"","kPath":"http://api.bats-bio.com","kAddTime":"2019-07-26 10:11:51","kPcPath":"","kWapPath":"","cName":"官方诊所","tName":"牙齿结构"},{"id":11,"kCompanyID":1,"kTypeID":15,"kTypePath":"1,15","kTitle":"洁牙","kTitleImg":"http://api.bats-bio.com/public/upload/course_files/1564106861655242.png","kContent":"","kPath":"http://api.bats-bio.com","kAddTime":"2019-07-26 10:08:04","kPcPath":"","kWapPath":"","cName":"官方诊所","tName":"洁牙"}]
     * pagecount : 1
     * total : 8
     */

    private int result;
    private String msg;
    private String token;
    private int pagecount;
    private int total;
    private List<DataBean> data;

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

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 18
         * kCompanyID : 1
         * kTypeID : 111
         * kTypePath : 111
         * kTitle : 测试
         * kTitleImg : http://api.bats-bio.com1
         * kContent : <style type="text/css">body:nth-of-type(1) .dhxtree_dhx_skyblue span.selectedTreeRow, body:nth-of-type(1) .dhxtree_dhx_skyblue span.selectedTreeRow_lor{background: #f00}</style><p><span class="l"><em>视频</em></span>                <span class="r cur"><em>GPS</em></span>                <a href="javascript:void(0);" class="splite_close"><em class="fa fa-angle-double-left"></em></a></p>
         * kPath : http://api.bats-bio.com1
         * kAddTime : 2019-07-31 09:37:48
         * kPcPath : 1
         * kWapPath : 2
         * cName : 官方诊所
         * tName : null
         */

        private int id;
        private int kCompanyID;
        private int kTypeID;
        private String kTypePath;
        private String kTitle;
        private String kTitleImg;
        private String kContent;
        private String kPath;
        private String kAddTime;
        private String kPcPath;
        private String kWapPath;
        private String cName;
        private String tName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getKCompanyID() {
            return kCompanyID;
        }

        public void setKCompanyID(int kCompanyID) {
            this.kCompanyID = kCompanyID;
        }

        public int getKTypeID() {
            return kTypeID;
        }

        public void setKTypeID(int kTypeID) {
            this.kTypeID = kTypeID;
        }

        public String getKTypePath() {
            return kTypePath;
        }

        public void setKTypePath(String kTypePath) {
            this.kTypePath = kTypePath;
        }

        public String getKTitle() {
            return kTitle;
        }

        public void setKTitle(String kTitle) {
            this.kTitle = kTitle;
        }

        public String getKTitleImg() {
            return kTitleImg;
        }

        public void setKTitleImg(String kTitleImg) {
            this.kTitleImg = kTitleImg;
        }

        public String getKContent() {
            return kContent;
        }

        public void setKContent(String kContent) {
            this.kContent = kContent;
        }

        public String getKPath() {
            return kPath;
        }

        public void setKPath(String kPath) {
            this.kPath = kPath;
        }

        public String getKAddTime() {
            return kAddTime;
        }

        public void setKAddTime(String kAddTime) {
            this.kAddTime = kAddTime;
        }

        public String getKPcPath() {
            return kPcPath;
        }

        public void setKPcPath(String kPcPath) {
            this.kPcPath = kPcPath;
        }

        public String getKWapPath() {
            return kWapPath;
        }

        public void setKWapPath(String kWapPath) {
            this.kWapPath = kWapPath;
        }

        public String getCName() {
            return cName;
        }

        public void setCName(String cName) {
            this.cName = cName;
        }

        public String getTName() {
            return tName;
        }

        public void setTName(String tName) {
            this.tName = tName;
        }
    }
}
