# idCardCv

#### 介绍
{**以下是码云平台说明，您可以替换此简介**
码云是 OSCHINA 推出的基于 Git 的代码托管平台（同时支持 SVN）。专为开发者提供稳定、高效、安全的云端软件开发协作平台
无论是个人、团队、或是企业，都能够用码云实现代码托管、项目管理、协作开发。企业项目请看 [https://gitee.com/enterprises](https://gitee.com/enterprises)}

本项目基于https://gitee.com/endlesshh/idCardCv.git ，对于一些代码进行了改造。

本项目分为两类：1、web应用 2、控制台应用。都可以独立运行。


支持：jdk8、Tessact4.0、junit4、opencv4.3、tess4j 4.5.1、win10 64bit   注：Tessact需要自行安装！

#### 软件架构
软件架构说明：基于spring boot项目

####中文摘要：

通过Tessact 对身份证的正反面进行识别，结合opencv(大型视觉类库)、tess4j在Java PC上生成应用，同时使用扩展语言包，对中文，英文和数字进行精确识别，通过jTessBoxEditor对识别图像进行训练，以便提升识别率！最终实现对身份证的正反面的识别。
注：本项目基于Java8、Tessact4.0、junit4、opencv4.3、tess4j4.5.1、win10 64bit

####英文摘要（English abstract）：

The positive and negative sides of ID card are identified by Tessact, and the application is generated on Java PC with tess4j. At the same time, the extended language package is used to accurately identify Chinese, English and numbers. The recognition image is trained by jtessboxeditor to improve the recognition rate! Finally, the positive and negative identification of ID card is realized.

Note: this project is based on java8, tessact4.0, junit4, opencv4.3, tes4j4.5.1, win10 64bit



####实验内容：

本项目是通过学习idCardCv 后整合tess4j,不需要经过训练直接使用的,当然,你也可以进行训练后进行使用。该项目修改原有的需要安装opencv的过程，全部使用javaccp技术重构,通过javaccp引入需要的c++库进行开发。不需要安装opencv 新增的了前端控制识别区域的功能，新增了后端识别后验证 ，页面样式主要适应paid，重新修改了后面的识别过程，用户opencv进行图片优化和区域 选择，使用tess4j进行数字和中文的识别 。

实验原理：


基于Tessact 、openCV等大型视觉库对图片进行处理，优化，调整，通过tess4j 对处理后的图像进行识别，通过jTessBoxEditor对图片识别进行训练。


#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 码云特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5.  码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
