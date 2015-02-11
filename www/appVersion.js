function AppVersion() { }

AppVersion.prototype.getVersionNumber = function(successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "AppVersion", "getVersionNumber", []);
};

AppVersion.prototype.getBuildNumber = function(successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "AppVersion", "getBuildNumber", []);
};

module.exports = new AppVersion();
