package com.electric3.dataatoms;

public interface IStatusProvider {
    StatusEnum getStatus();
    void setStatus(StatusEnum status);
}
