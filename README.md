仪表盘进度条
=========
-----已通过JitPack发布  
博客：http://blog.csdn.net/sdfdzx/article/details/67639926  
可以自定义的属性：  
1.仪表盘半径  
2.仪表盘宽度  
3.指针大小  
4.刻度的密度  
5.可触发触摸事件对应设置进度（可选择）  
6.进度动画（可选择）

#### 实现效果
![实现效果](http://upload-images.jianshu.io/upload_images/7866586-3b1cad62935d8052.gif?imageMogr2/auto-orient/strip)

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
