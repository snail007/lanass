# LanASS
[goproxy](https://github.com/snail007/goproxy) 的安卓内网穿透客户端，自带开启ss服务，方便好用，为你的内网开启一扇天窗。

## 下载使用

[点击下载](https://github.com/snail007/lanass/releases)

## 提示
为了保证app长时间运行：  
1.请把app添加到系统白名单   
2.首次运行app会提示开启通知权限，为了保证app服务一直运行，请允许。  

## 运行界面

![](https://github.com/snail007/lanass/blob/master/snapshot/1.png?raw=true)

![](https://github.com/snail007/lanass/blob/master/snapshot/2.png?raw=true)

# 开发环境
- ide: AndroidStudio
- jdk: 1.11
- 基于snail007/goproxy官方安卓SDK开发， 下载项目之后，需要下载snail007/goproxy官方安卓SDK然后解压得到文件 snail007.goproxy.sdk.aar和snail007.goproxy.sdk-sources.jar放到项目目录app/libs下面即可，然后项目就可以正常编译使用。

# 浏览器URL拉起协议
- 明文方式，格式：`lanass://ass.app/?host=2.2.2.2&port=33001&key=0001&wspass=112&ssport=38221&sspass=123`
- base64编码，格式：`lanass://ass.app/base64/aG9zdD0yLjIuMi4yJnBvcnQ9MzMwMDEma2V5PTAwMDEmd3NwYXNzPTExMiZzc3BvcnQ9MzgyMjEmc3NwYXNzPTEyMw==`  
  `base64/`后面的base64编码字符串明文是：`host=2.2.2.2&port=33001&key=0001&wspass=112&ssport=38221&sspass=123`
## 参数说明：
- host：proxy的内网穿透bridge的机器IP。
- port：proxy的内网穿透bridge使用的端口。
- key：内网穿透client侧（也就是本机安卓）使用的唯一标识，数字字母组成，保证连接到同一个bridge的端口的所有client使用的唯一标识不重复唯一即可。
- wspass：连接proxy的内网穿透bridge的底层传输密码，这个密码是启动proxy的内网穿透bridge时设置的。
- ssport：本机安卓启动一个ss服务，服务使用的安卓本机端口。
- sspass：本机安卓启动一个ss服务，服务使用的密码，数字字母组成。

# 助手
拉起协议URL直接发给小白，在浏览器会打不开，项目提供了一个生成打开按钮的页面，地址如下：

[打开助手](https://snail007.host900.com/lanass/generate.html)
