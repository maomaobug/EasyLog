# EasyLog
An Android Log that automatically set the file name and line number as the tag.

##Import
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
##Usage
```java
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyLog.e("sample18");
    }
}
```
output:
```java
03-27 14:03:11.513      681-681/me.zhanghailin.sample E/MainActivity.java#18﹕ sample18
```
