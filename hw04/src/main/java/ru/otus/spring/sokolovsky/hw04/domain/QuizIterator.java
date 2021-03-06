package ru.otus.spring.sokolovsky.hw04.domain;

public interface QuizIterator {

    Question getCurrentQuestion();

    void next();

    boolean hasNext();

    void reset();
}
