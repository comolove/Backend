package Funssion.Inforum.domain.post.memo.exception;

import Funssion.Inforum.common.exception.UnAuthorizedException;

public class NeedAuthenticationException extends UnAuthorizedException {
    public NeedAuthenticationException(String message) {
        super(message + " need authentication");
    }
}
