package com.cherry.jeeves.exception;

public class WechatException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WechatException() {
    }

    public WechatException(String message) {
        super(message);
    }

    public WechatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WechatException(Throwable cause) {
        super(cause);
    }

    public WechatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
