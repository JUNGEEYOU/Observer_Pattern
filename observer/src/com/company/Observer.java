package com.company;

/* 1. Observer 인터페이스 정의   */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
