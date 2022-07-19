# A beautifull Motion Toast And Snackbar

![](https://www.karier.mu/blog/wp-content/uploads/2021/12/programmin.jpg)

# Muhammad devin arrasyid
Hello This is my project

## This is the UI 
<table style="width:100%">
  <tr>
    <th>1. Toast Preview </th>
    <th>2. Snackbar Preview </th>
    
  </tr>
  <tr>
    <td><img src = "https://i.postimg.cc/XY5mC7Mm/Screenshot-1658130812.png"/></td>
   <td><img src = "https://i.postimg.cc/s29LT6gJ/Screenshot-1658130820.png"/></td>
  </tr>
</table>

## Library

Step 1. Add the JitPack repository for Toast And Snackbar to your build file

Add it in your root build.gradle at the end of repositories:



```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

## Dependency Toast

Add dependency in your app module

```
	dependencies {
	        implementation 'com.github.Spikeysanju:MotionToast:1.4' 
	}

```

### Succes Toast
```
MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))  
```

