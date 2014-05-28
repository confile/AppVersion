function AppVersion() { }

AppVersion.prototype.getVersionNumber = function(successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "AppVersion", "getVersionNumber", []);
};

module.exports = new AppVersion();