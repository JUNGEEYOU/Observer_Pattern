package com.company;

/* 1. Subject 인터페이스 정의   */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
