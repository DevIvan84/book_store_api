package com.todotic.bookstoreapi.exception;


public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String mesSsage) {
        super(mesSsage);
    }

}
