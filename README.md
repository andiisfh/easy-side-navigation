
# EasySideNavigation

![Release](https://jitpack.io/v/andiisfh/easy-side-navigation.svg)



## Requirements
```
Compile SDK Version 28
Target SDK Version 28
Build Tools Version 28.0.0
```
## Gradle Dependency
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency

![Release](https://jitpack.io/v/andiisfh/easy-side-navigation.svg)
```
dependencies {
        implementation 'com.github.andiisfh:easy-side-navigation:${version}'
}
```

## Usage
Extends your Activity to EasySideNavigation
```Java
public class MainActivity extends EasySideNavigation {
	...
}
```

Setup all necessary function
```Java
...
Toolbar mToolbar;
    
    // Set the main layout resource. It includes a toolbar
    @Override
    protected int setViewResource() {
        return R.layout.activity_main;
    }
    
    // Main layout has been inflated
    @Override
    protected void onViewReady(View view) {
        mToolbar = findViewById(R.id.toolbar);
    }

    // Set the toolbar
    @Override
    protected Toolbar setToolbar() {
        return mToolbar;
    }

    // Set the header navigation view layout resource
    @Override
    protected int setNavigationHeaderResource() {
        return R.layout.header_navigation_menu;
    }

    // Set the navigation menu resource
    @Override
    protected int setNavigationMenu() {
        return R.menu.navigation_menu;
    }

    // Listener when navigation item has been selected
    @Override
    protected void onNavigationItemSelected(MenuItem menuItem) {

    }
...
```
### Done!

## License
```
Copyright 2018 Andi Insanudin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
