package com.standalone.rmi.consume;

import com.standalone.rmi.client.RmiService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by É÷ÐÞ on 15/12/25.
 */
public class RmiConsume {

    public static void main(String[] args) {
        String rmiAddr="rmi://localhost:8000/RmiService";
        try {
            RmiService rmiService = (RmiService) Naming.lookup(rmiAddr);
            rmiService.helloWorld("ÍòÄÜµÄ");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
