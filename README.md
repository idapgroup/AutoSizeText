# AutoSizeText
![Maven Central](https://img.shields.io/maven-central/v/com.idapgroup/autosizetext-compose)

AutoSizeText component for `Material3 Android Compose`.

## Setup
Please, check that repositories has `mavenCentral()`
```groovy
repositories {
  mavenCentral()
}
```
Add to your module next dependency:
```groovy
dependencies {
  implementation 'com.idapgroup:autosizetext-compose:0.2.1'
}
```
`Note:` Do not forget to add compose dependencies 🙃

## Usage sample
`AutoSizeText` has all the properties that original `Text` has plus additional property `minFontSize`. 
If `minFontSize` is not specified, the text size will scale down until fit the borders.
Also remember that `AutoSizeText` will not have effect if text has no borders (`wraps the content`). 
You can strict it with `maxLines` 
```kotlin
AutoSizeText(
  text = longText,
  maxLines = 2,
  fontSize = 14.sp,
  minFontSize = 12.sp
)
```
or set the `height` for the modifier.
```kotlin
AutoSizeText(
    modifier = Modifier.height(40.dp),
    text = longText,
    fontSize = 40.sp,
)
Box(modifier = Modifier.height(40.dp)) {
    AutoSizeText(
        text = longText,
        fontSize = 40.sp,
    )
}
```
For more info, please check the `sample` module.
