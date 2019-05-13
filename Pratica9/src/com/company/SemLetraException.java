package com.company;

public class SemLetraException extends Exception {
    @Override
    public String getMessage() {
        return "\n Não tem a letra B";
    }
}