package com.isg.laidsoa.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class RessourceNotFound extends RuntimeException {

    private    static final long serialVersionUID= 1L;
    public RessourceNotFound(String message){
        super(message);

    }
}


