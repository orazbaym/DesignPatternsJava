package com.company;

import java.util.List;

public interface IObserver {
    void update(List<String> subjects);
}