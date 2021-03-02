package com.markfly.markflyweather.db;

import org.litepal.crud.DataSupport;

//模型类,为子类提供方法,id记录id,name记录名字,code记录代号
public class Model extends DataSupport {

    private int id;

    private String name;

    private int code;

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getCode() {

        return code;

    }

    public void setCode(int code) {

        this.code = code;

    }
}
