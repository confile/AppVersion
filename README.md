AppVersion
==========

Get the app version of a cordova application


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
