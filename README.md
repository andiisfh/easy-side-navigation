![Release](https://jitpack.io/v/andiisfh/easy-side-navigation.svg)

## Requirements
---
```
Compile SDK Version 28
Target SDK Version 28
Build Tools Version 28.0.0
```
## Steps
---
##### 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

##### 2. Add the dependency:
```
dependencies {
	        implementation 'com.github.andiisfh:easy-side-navigation:Tag'
	}
```

##### 3. Extends your Activity to EasySideNavigation:
```
public class MainActivity extends EasySideNavigation {
	...
}
```

##### 4. Setup all necessary function:
```
...
Toolbar mToolbar;
    
    @Override
    protected int setViewResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewReady(View view) {
        mToolbar = findViewById(R.id.toolbar);
    }

    @Override
    protected Toolbar setToolbar() {
        return mToolbar;
    }

    @Override
    protected int setNavigationHeaderResource() {
        return R.layout.header_navigation_menu;
    }

    @Override
    protected int setNavigationMenu() {
        return R.menu.navigation_menu;
    }

    @Override
    protected void onNavigationItemSelected(MenuItem menuItem) {

    }
...
```
### Done!

### 
