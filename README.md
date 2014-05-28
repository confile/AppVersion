AppVersion
==========

Get the app version of a cordova application. Note that it shows the app version which is present to the user not the build version which is only for internal use.


### Installing the plugin to your project

In your project directory:

```bash
cordova plugins add https://github.com/confile/AppVersion
```

## Usage

```
window.Appversion.getVersionNumber(function(versionNumber) {
	console.log('versionNumber: '+versionNumber);
});
```

Note: The android version returns the android:versionName value of AndroidManifest.xml

## Platforms

IOS and Android, windows Phone will be supported later.
