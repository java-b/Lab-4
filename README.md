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

给定一个 **字符串表达式**，实现 **整数四则运算**。

下面是字符串表达式的样例：
```
1+1
1-1000
999*1
9/2
```

注意：

- 操作数和结果都是 32 位整数
- 除法是整除，且不需要考虑除数为 0 的情况


### 代码编写

在 `Calculator` 文件中，你 **只需要** 将代码写在两个`===== YOUR CODE HERE =====` 之间的区域，其他区域代码 **禁止修改**。

请将字符串 `s` 作为表达式进行处理，并把算出来的结果放在整数 `result` 中。


### 测试与提交

运行代码，如果结果是 `:) You have passed all tests, please upload your code onto FTP.`，那么说明代码正确，请提交到 FTP；如果结果是 `:( Sorry, it seems that there is something wrong with your code.` 请重新检查代码。

提交时请 **将整个 Calculator 目录打包**，而非单个 java 文件。


### 提示


**没有遇到困难不要看**

**没有遇到困难不要看**

**没有遇到困难不要看**

一种解决方案：

1. 使用循环语句读取字符串中的字符（`charAt()`），直到读到 `+-*/`，将前面读到的字符串转化为数字（`Integer.parseInt()`）。
2. 跳过操作符，继续读字符直到结尾（`length()`），将读到的字符串转化为数字。
3. 根据操作符求出两个数字的结果。
