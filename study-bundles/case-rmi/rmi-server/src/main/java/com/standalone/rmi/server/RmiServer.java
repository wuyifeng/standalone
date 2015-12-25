package com.standalone.rmi.server;

import com.standalone.rmi.client.RmiService;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by 慎修 on 15/12/25.
 */
public class RmiServer {
    public static void main(String[] args) {
        try {
            //创建一个远程对象
            RmiService rmiService = new RmiServiceImpl();
            /**
             * 本地主机上的远程对象注册表Registry的实例，并指定端口为8888，这一步必不可少（Java默认端口是1099)
             * 必不可缺的一步，缺少注册表创建，则无法绑定对象到远程注册表上
             */
            LocateRegistry.createRegistry(8000);
            Naming.bind("rmi://localhost:8000/RmiService", rmiService);
            System.out.println("***********************");
            System.out.println("服务绑定成功");
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
