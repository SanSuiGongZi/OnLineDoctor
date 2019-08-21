package com.example.wayne.dentist.bean;

/**
 * @name 张东
 * @time 2019/8/19  15:08
 * @describe
 */
public class HistoryBean {

    private String history;

    public HistoryBean(String history) {
        this.history = history;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "HistoryBean{" +
                "history='" + history + '\'' +
                '}';
    }
}
