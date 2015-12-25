# 一、什么是RMI
    
&emsp;&emsp;&emsp;&emsp;Java远程方法调用，即Java RMI（Java Remote Method Invocation）是Java编程语言里，一种用于实现远程过程调用的应用程序编程接口。它使客户机上运行的程序可以调用远程服务器上的对象。远程方法调用特性使Java编程人员能够在网络环境中分布操作。RMI全部的宗旨就是尽可能简化远程接口对象的使用。
&emsp;&emsp;&emsp;&emsp;Java RMI极大地依赖于接口。在需要创建一个远程对象的时候，程序员通过传递一个接口来隐藏底层的实现细节。客户端得到的远程对象句柄正好与本地的根代码连接，由后者负责透过网络通信。这样一来，程序员只需关心如何通过自己的接口句柄发送消息。
&emsp;&emsp;&emsp;&emsp;接口的两种常见实现方式是：最初使用JRMP（Java Remote Message Protocol，Java远程消息交换协议）实现；此外还可以用与CORBA兼容的方法实现。RMI一般指的是编程接口，也有时候同时包括JRMP和API（应用程序编程接口），而RMI-IIOP则一般指RMI接口接管绝大部分的功能，以支持CORBA的实现。
&emsp;&emsp;&emsp;&emsp;最初的RMI API设计为通用地支持不同形式的接口实现。后来，CORBA增加了传值（pass by value）功能，以实现RMI接口。然而RMI-IIOP和JRMP实现的接口并不完全一致。

# 二、基本原理

&emsp;&emsp;&emsp;&emsp;要实现网络机器间的通讯，首先得来看看计算机系统网络通信的基本原理，在底层层面上来看，网络通信需要做的就是将流从一台计算机传输到另一台计算机，基于传输协议和网络IO来实现，其中传输协议比较出名的有HTTP、TCP、UDP等等，HTTP、TCP、UDP都是基于sokect概念上为某种应用场景而扩展出的传输协议，网络IO，主要有bio、nio、aio三种方式，所有的分布式应用通讯都是基于这个原理而实现的，只是为了应用的易用，各种语言通常都会提供一些更为贴切应用易用的应用层协议。

# 三、开发步骤

* 编写远程服务接口，该接口必须继承 java.rmi.Remote 接口，方法必须抛出 java.rmi.RemoteException 异常；
* 编写远程接口实现类，该实现类必须继承 java.rmi.server.UnicastRemoteObject 类；
* 运行RMI编译器（rmic），创建客户端 stub 类和服务端 skeleton 类;
* 启动一个RMI注册表，以便驻留这些服务;
* 在RMI注册表中注册服务；
* 客户端查找远程对象，并调用远程方法；
