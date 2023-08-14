package com.hei.springproject.DatabaseConfiguration;

public class Settings {

    public static  String DATABASE = "springproject";
    public static  String USERNAME = "postgres";
    public static  String PASSWORD = System.getenv("DATASOURCE_PASSWORD");
}
