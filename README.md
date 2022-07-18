# A beautifull Motion Toast And Snackbar

// ![](http://i.imgur.com/y8g506n.png?1)

# Reyhan M Akbar
Hello This is my project

## This is the UI 
<table style="width:100%">
  <tr>
    <th>1. Toast Preview </th>
    <th>2. Snackbar Preview </th>
    
  </tr>
  <tr>
    <td><img src = "https://i.postimg.cc/sg3v8hfL/Screenshot-1658129136.png"/></td>
   <td><img src = "https://i.postimg.cc/5tckbbGD/Screenshot-1658130036.png"/></td>
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

### Error Toast
```
 MotionToast.createColorToast(this,"Profile Update Failed!",
                    MotionToastStyle.ERROR,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular))  
```

