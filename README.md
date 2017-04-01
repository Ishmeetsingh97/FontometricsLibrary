![alt tag](https://github.com/Ishmeetsingh97/FontometricsLibrary/blob/master/FontometricsArtwork.jpg)
# FontometricsLibrary
[![API](https://img.shields.io/badge/API-10%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=10)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Fontometrics-green.svg?style=flat)](https://android-arsenal.com/details/1/4972)
[![Android Dev Digest](https://img.shields.io/badge/Android%20Dev%20Digest-%23124-cyan.svg)](https://www.androiddevdigest.com/digest-124/)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
<br/>
A Simple Android Library to use Custom Fonts with Ease. Use Customs Fonts in your Android project without adding any .ttf/.otf in Assests Folder.
## Installation  <br/>

#### Add gradle dependency with command:
```groovy
dependencies {
    compile 'org.ishmeetsingh.androbot:fontometrics:1.0.0'
    }
```
#### By using Maven
```groovy
<dependency>
  <groupId>org.ishmeetsingh.androbot</groupId>
  <artifactId>fontometrics</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
## Implementation
You can change the font of any `TextView` by adding just one line. `TextView_Id.setTypeface(Fontometrics.Font_Name(Context context));`

```groovy
TextView textview;
textview = (TextView) findViewById(R.id.textview_id);
textview.setTypeface(Fontometrics.coffee_with_sugar(this));
```
### For implementation you can also refer the sample app provider in the repo.
*TO SUPPORT FOR SUCH MORE LIBRARIES, CHECK THIS (http://github.com/ishmeetsingh97).
