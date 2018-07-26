package com.chainbox.ussd.agentlocator.Notification;

public class Success {
    public int status;
    public String message;

    public Success(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
