package com.example.wayne.dentist.bean;

import java.util.List;

/**
 * @name 张东
 * @time wayne2019/8/12
 * @describe
 */
public class TabBean {
    /**
     * result : 1
     * msg :
     * token : 96e5f099c35734a1a334b03b9e786bd6
     * data : [{"id":1,"tCompanyID":1,"tPid":0,"tName":"养护百科","tDept":1,"tParentPath":"","tSortID":1},{"id":8,"tCompanyID":1,"tPid":0,"tName":"诊疗百科","tDept":1,"tParentPath":"0","tSortID":2},{"id":114,"tCompanyID":1,"tPid":0,"tName":"百科周刊","tDept":1,"tParentPath":"0","tSortID":3},{"id":115,"tCompanyID":1,"tPid":0,"tName":"推荐阅读","tDept":1,"tParentPath":"0","tSortID":4}]
     * pagecount : 1
     * total : 4
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
         * id : 1
         * tCompanyID : 1
         * tPid : 0
         * tName : 养护百科
         * tDept : 1
         * tParentPath :
         * tSortID : 1
         */

        private int id;
        private int tCompanyID;
        private int tPid;
        private String tName;
        private int tDept;
        private String tParentPath;
        private int tSortID;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getTCompanyID() {
            return tCompanyID;
        }

        public void setTCompanyID(int tCompanyID) {
            this.tCompanyID = tCompanyID;
        }

        public int getTPid() {
            return tPid;
        }

        public void setTPid(int tPid) {
            this.tPid = tPid;
        }

        public String getTName() {
            return tName;
        }

        public void setTName(String tName) {
            this.tName = tName;
        }

        public int getTDept() {
            return tDept;
        }

        public void setTDept(int tDept) {
            this.tDept = tDept;
        }

        public String getTParentPath() {
            return tParentPath;
        }

        public void setTParentPath(String tParentPath) {
            this.tParentPath = tParentPath;
        }

        public int getTSortID() {
            return tSortID;
        }

        public void setTSortID(int tSortID) {
            this.tSortID = tSortID;
        }
    }
}
