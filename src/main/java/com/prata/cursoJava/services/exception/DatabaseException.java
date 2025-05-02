package com.prata.cursoJava.services.exception;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
            super(message);
    }
}
