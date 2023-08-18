# lucky number app
Android project to learn intent, custom drawables (xml)

![lucky-number-app](https://github.com/MananDhiman/lucky-number-app/assets/64782929/d1bef073-0b6b-4082-95e2-d52d71ef145b)


# Intent
## Implicit Intent
Intent that does not specifically states the target
```kotlin
val intent = Intent(Intent.ACTION_SEND)
intent.type = "text/plain"
intent.putExtra(Intent.EXTRA_SUBJECT, "$name is lucky today")
intent.putExtra(Intent.EXTRA_TEXT, "Their lucky number is ${luckyNumber.toString()}") // main body
startActivity(intent)	
```
## Explicit Intent
Intent that specifically states the target
```kotlin
val intent: Intent = Intent(this, SecondActivity::class.java)
intent.putExtra("name",name) // pass data to activity
startActivity(intent)
```
# Drawable 
Can be used as background or foreground of any android view
```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android">
  <gradient
    android:type="linear"
    android:angle="45"
    android:startColor="@color/black"
    android:centerColor="@color/gray"
    android:endColor="@color/white" />
  
  <corners
    android:topRightRadius="8dp"
    android:radius="50dp"/>
  
  <stroke
    android:width="5dp"
    android:color="@color/white" />
</shape>
```
