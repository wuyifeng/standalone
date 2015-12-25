package com.standalone.rmi.server;

import com.standalone.rmi.client.RmiService;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by ���� on 15/12/25.
 */
public class RmiServer {
    public static void main(String[] args) {
        try {
            //����һ��Զ�̶���
            RmiService rmiService = new RmiServiceImpl();
            /**
             * ���������ϵ�Զ�̶���ע���Registry��ʵ������ָ���˿�Ϊ8888����һ���ز����٣�JavaĬ�϶˿���1099)
             * �ز���ȱ��һ����ȱ��ע����������޷��󶨶���Զ��ע�����
             */
            LocateRegistry.createRegistry(8000);
            Naming.bind("rmi://localhost:8000/RmiService", rmiService);
            System.out.println("***********************");
            System.out.println("����󶨳ɹ�");
            System.out.println("***********************");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
