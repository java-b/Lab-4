# Lab-4

> 本次 Lab 目标：
>
> 学习循环语句 for/while 的使用
>

## 使用 IDEA 导入 Lab4 代码

从本次 Lab 开始，希望大家使用 IDEA 编写代码。

**第一步**： 在 Lab-4 首页点击 `Clone or Download` -> `Download ZIP`，下载本次 Lab 的代码并解压，里面包含文件 `README.md` 和目录 `Calculator`。

**第二步**： 打开 IDEA，点击 `Open`（或者 `File` -> `Open`），找到下载的 `Calculator` 文件夹，点击确定。

**第三步**： 打开 `Calculator.java`。

## 实现一个计算器

### 要求

给定一个 **字符串表达式**，实现 **加减混合运算**。

下面是字符串连加表达式的样例：
```
1+1
98-1+1
1+2-3-4
```

注意：

- 操作数和结果都是 32 位正整数
- 表达式内无空格，不会出现诸如 `1 +1`、`1+ 2 +3` 之类的情况
- 加减号的数量、顺序不固定
- 第一个数字为非负数


### 代码编写

在 `Calculator` 文件中，你 **只需要** 将代码写在两个`===== YOUR CODE HERE =====` 之间的区域，其他区域代码 **禁止修改**。

请将字符串 `s` 作为表达式进行处理，并把算出来的结果放在整数 `result` 中。



### 提示

- **本节上机课将不会提供对如何使用某函数的帮助和支持。** 如果你想了解如何使用某函数，例如例如 `寻找字符串中某字符（＋）出现的第一个位置`、`截取字符串`，你有以下两种解决方案：
    - 查看 `JDK Documentation` 的 `String` 类。（[点此进入 JDK Documentation](https://docs.oracle.com/javase/8/docs/api/)，或者使用[在线中文文档](http://tool.oschina.net/apidocs/apidoc?api=jdk-zh)，FTP 上有离线文档下载。））
    - 使用搜索引擎搜索你需要使用的函数，例如搜索关键词可以是 **java 截取字符串**。（点此进入[百度搜索](http://www.baidu.com)或[必应搜索](http://cn.bing.com)）
- 鼓励同学们把解题思路发在 github issue 上。

### 测试与提交

运行代码，如果结果是 `:) You have passed all tests, please upload your code onto FTP.`，那么说明代码正确，请提交到 FTP；如果结果是 `:( Sorry, it seems that there is something wrong with your code.` 请重新检查代码。

提交时请 **将整个 Calculator 目录打包**，而非单个 java 文件。
