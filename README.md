# EasyLog
And Android Log that automatically use the file name and line number as the tag.

##Usage
###1. In your module *build.gradle* file:
```java
repositories {
        // existing things...
        
        maven {
            url 'https://raw.github.com/maomaobug/EasyLog/master/deploy'
        }
    }
``` 
###2. In your module *builde.gradle* file:
```java
dependencies {
    // existing things...
    
    compile 'me.zhanghailin.easylog:easylog:1.0.0'
}
```
