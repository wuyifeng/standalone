package com.standalone.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ���� on 15/12/25.
 */
public interface RmiService extends Remote {
    public void helloWorld(String msg) throws RemoteException;
}
