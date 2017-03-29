仪表盘进度条
=========
-----已通过JitPack发布
可以自定义的属性：  
1.仪表盘半径  
2.仪表盘宽度  
3.指针大小  
4.刻度的密度  
5.可触发触摸事件对应设置进度（可选择）  
6.进度动画（可选择）

#### 实现效果
![这里写图片描述](http://img.blog.csdn.net/20170328180428462?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvc2RmZHp4/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)  

# How to：
**Step 1. Add the JitPack repository to your build file** 
Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency

```
dependencies {
	        compile 'com.github.sdfdzx:DriverProgress:v1.0.4'
	}
```
