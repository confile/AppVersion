/*
    The MIT License (MIT)
    Copyright (c) 2014 Michael Gorski
*/

#import <Cordova/CDV.h>
#import "AppVersion.h"


@implementation AppVersion

- (void) getVersionNumber:(CDVInvokedUrlCommand*)command
{
	CDVPluginResult* pluginResult = nil;
//	NSString* version = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"CFBundleVersion"]; // build version number
	NSString* version = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"CFBundleShortVersionString"]; // release version number

	pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:version];

	[self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}


@end
