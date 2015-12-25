package com.standalone.rmi.server;

import com.standalone.rmi.client.RmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by É÷ÐÞ on 15/12/25.
 */
public class RmiServiceImpl extends UnicastRemoteObject implements RmiService {

    protected RmiServiceImpl() throws RemoteException {

    }

    public void helloWorld(String msg) throws RemoteException{
        System.out.println(msg+"hello rmi!");
    }
}
