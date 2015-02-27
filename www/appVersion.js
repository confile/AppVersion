function AppVersion() { }

AppVersion.prototype.getVersionNumber = function(successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "AppVersion", "getVersionNumber", []);
};

AppVersion.prototype.getBuildNumber = function(successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "AppVersion", "getBuildNumber", []);
};

AppVersion.prototype.geAlbumPermission = function(successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "AppVersion", "geAlbumPermission", []);
};

module.exports = new AppVersion();
