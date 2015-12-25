# 1、创建工程

    1.1、mvn archetype:generate -DgroupId=com.standalone -DartifactId=standalone -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local，当前目录会生成一个子目录standalone 删除src

    1.2、生成的pom.xml做点修改：将  <packaging>jar</packaging>改为 <packaging>pom</packaging>，这样这个pom.xml才成为父pom.

    1.3、DinteractiveMode 表示读取是否是网络，false 表示不是，-DarchetypeCatalog=local 这个表示读取archetype是在本地读取，所以要将archetype-catalog.xml放到maven仓库目录下。
两个是配对使用的

# 2、创建子模块

* 进入standalone目录
* common-dal
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=common-dal -Dpackage=com.standalone.common.dal -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
* core-model
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=core-model -Dpackage=com.standalone.core.model -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
* core-service
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=core-service -Dpackage=com.standalone.core.service -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
* biz-manager
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=biz-manager -Dpackage=com.standalone.biz.manager -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
* web-app
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=webapp -Dpackage=com.standalone.web -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false -DarchetypeCatalog=local

* rmi-client
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=rmi-client -Dpackage=com.standalone.rmi.client -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
* rmi-server
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=rmi-server -Dpackage=com.standalone.rmi.server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
* rmi-consume
  * mvn archetype:generate -DgroupId=com.standalone -DartifactId=rmi-consume -Dpackage=com.standalone.rmi.consume -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
