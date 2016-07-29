##Maven   
###Hello-World
- 生成maven项目
```zsh
 mvn archetype:generate -DgroupId=helloworld -DartifactId=helloworld
```   
- [pom.xml](pom.xml)，groupId:artifactId:packaging:version这个四元组能够唯一标记一个项目。
我们不仅可以用这个四元组来标记我们的项目，也可以用来标记其它的项目，比如用来描述项目依赖关系。
perperties中定义了项目的属性，也可以在这里定义变量并在其它的地方引用。至于最后的dependencies，
则是描述了项目的依赖关系，Maven会根据依赖关系自动下载相应的文件并在编译时使用。  
在大型项目开发中，往往会将其分成若干个子项目，每个子项目都有着自己的的pom.xml，它们与父pom.xml之间相当于继承的关系。
可以说，pom.xml文件的配置是整个Maven的核心重点，也是学习Maven过程中需要详细了解的内容。这里只给出了最简单的配置样例，详细了解可以查看官方文档。
接下来编译并运行Helloworld项目。
- 如果是第一次编译的话，需要联网，因为Maven会自动下载依赖包。  
```zsh
mvn package
```  
- 下载的依赖包会保存在~/.m2/repository文件夹中，打开这个文件夹，我们会发现里面的包正是按前面所说的四元组目录结构进行存储的。
Maven在依赖一个jar包时会先去本地库查找，如果没找到就会从网上下载。当然，并不是所有的包都能从网上下载到，比如我们自己开发的jar包，
这时，我们就可以用***mvn install***命令将一个项目安装到本地仓库。
打包成功后我们会发现项目中多了一个target文件夹。
- 可以看到，在package过程中，maven完成了编译、测试代码，生成测试报告，生成jar包等一系列工作。
- 运行程序   
```zsh
java -cp target/helloworld-1.0-SNAPSHOT.jar helloworld.App
```   

###Maven基本命令
- Maven的命令非常多，学习命令首先要了解Maven的生命周期。
Maven首先会验证并处理引用资源，之后进行项目编译，如果没有声明跳过测试，也会编译测试代码并进行测试、以成测试报告。最后，Maven会将编译好的内容进行打包，用于发布。
Maven命令与Maven的生命周期有着对应的关系，一个命令也经常会包含多个生命周期，比如mvn package会完成以上所有步骤。
这里列举几个常用的命令
- mvn compile     编译项目
- mvn test        编译运行单元测试
- mvn package     打包(jar or war)
- mvn install     将项目安装到本地仓库
- mvn clean       清空项目
- mvn eclipse:eclipse     生成eclipse工程

##References
- [Linux下maven的安装](http://cwiki.apache.org/confluence/display/MAVEN/PluginConfigurationException)
