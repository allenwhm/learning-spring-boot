package com.allenwhm;

/**
 * @author allenwhm
 * @date 2018/3/27 22:54
 * @description
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
