/*
    The MIT License (MIT)
    Copyright (c) 2014 Michael Gorski    

*/

#import <Cordova/CDVPlugin.h>

@interface AppVersion : CDVPlugin

- (void) getVersionNumber:(CDVInvokedUrlCommand*)command;

- (void) getBuildNumber:(CDVInvokedUrlCommand*)command;

@end
