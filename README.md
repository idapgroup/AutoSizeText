# AutoSizeText

AutoSizeText component for `Material3 Android Compose`.

## Setup
Please, check that repositories has `mavenCentral()`
```groovy
repositories {
  mavenCentral()
}
```
Add to your module next dependency:

![Maven Central](https://img.shields.io/maven-central/v/com.idapgroup/autosizetext-compose)
```groovy
dependencies {
  implementation 'com.idapgroup:autosizetext-compose:<latest-version>'
}
```
`Note:` Do not forget to add compose dependencies 🙃

## Usage sample
`AutoSizeText` has all the properties that original `Text` has plus additional properties:
+ `minFontSize` - specifies min value for font size. If min value reached but text still overflows, `overflow` parameter will be used. If `minFontSize` is not specified, the text size will scale down until fit the borders and `overflow` param will be ignored.
+ `keepLineHeight` - specifies line height changes. Default value `false` means that line height will be changed in aspect ratio to the default `fontSize` and `lineHeight`. `true` means that provided `lineHeight` will be unchanged.

Also remember that `AutoSizeText` will not have effect if text has no borders (`wraps the content`).

For reach the autosizing effect, uou can strict the `maxLines` param
```kotlin
AutoSizeText(
  text = longText,
  maxLines = 2,
  fontSize = 14.sp,
  lineHeight = 16.sp,
  minFontSize = 12.sp
)
```
or set the `height` for the modifier.
```kotlin
AutoSizeText(
    modifier = Modifier.height(60.dp),
    text = longText,
    fontSize = 40.sp,
    lineHeight = 42.sp,
    keepLineHeight = true,
    overflow = TextOverflow.Ellipsis,
)
Box(modifier = Modifier.height(40.dp)) {
    AutoSizeText(
        text = longText,
        fontSize = 40.sp,
        lineHeight = 42.sp,
        keepLineHeight = false,
    )
}
```
For more info, please check the `sample` module.
