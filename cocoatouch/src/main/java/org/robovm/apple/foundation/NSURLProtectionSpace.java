/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLProtectionSpace/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSURLProtectionSpacePtr extends Ptr<NSURLProtectionSpace, NSURLProtectionSpacePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLProtectionSpace.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLProtectionSpace() {}
    protected NSURLProtectionSpace(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public static NSURLProtectionSpace create(String host, long port, String protocol, String realm, String authenticationMethod) {
        NSURLProtectionSpace o = new NSURLProtectionSpace((SkipInit) null);
        long handle = o.initWithHost$port$protocol$realm$authenticationMethod$(host, port, protocol, realm, authenticationMethod);
        if (handle == 0) {
            return null;
        }
        o.initObject(handle);
        return o;
    }

    public static NSURLProtectionSpace createProxy(String host, long port, String type, String realm, String authenticationMethod) {
        NSURLProtectionSpace o = new NSURLProtectionSpace((SkipInit) null);
        long handle = o.initWithProxyHost$port$type$realm$authenticationMethod$(host, port, type, realm, authenticationMethod);
        if (handle == 0) {
            return null;
        }
        o.initObject(handle);
        return o;
    }

    /*<methods>*/
    @GlobalValue(symbol="NSURLProtectionSpaceHTTP", optional=true)
    public static native String ProtocolTypeHTTP();
    @GlobalValue(symbol="NSURLProtectionSpaceHTTPS", optional=true)
    public static native String ProtocolTypeHTTPS();
    @GlobalValue(symbol="NSURLProtectionSpaceFTP", optional=true)
    public static native String ProtocolTypeFTP();
    @GlobalValue(symbol="NSURLProtectionSpaceHTTPProxy", optional=true)
    public static native String ProxyTypeHTTP();
    @GlobalValue(symbol="NSURLProtectionSpaceHTTPSProxy", optional=true)
    public static native String ProxyTypeHTTPS();
    @GlobalValue(symbol="NSURLProtectionSpaceFTPProxy", optional=true)
    public static native String ProxyTypeFTP();
    @GlobalValue(symbol="NSURLProtectionSpaceSOCKSProxy", optional=true)
    public static native String ProxyTypeSOCKS();
    @GlobalValue(symbol="NSURLAuthenticationMethodDefault", optional=true)
    public static native String AuthenticationMethodDefault();
    @GlobalValue(symbol="NSURLAuthenticationMethodHTTPBasic", optional=true)
    public static native String AuthenticationMethodHTTPBasic();
    @GlobalValue(symbol="NSURLAuthenticationMethodHTTPDigest", optional=true)
    public static native String AuthenticationMethodHTTPDigest();
    @GlobalValue(symbol="NSURLAuthenticationMethodHTMLForm", optional=true)
    public static native String AuthenticationMethodHTMLForm();
    @GlobalValue(symbol="NSURLAuthenticationMethodNTLM", optional=true)
    public static native String AuthenticationMethodNTLM();
    @GlobalValue(symbol="NSURLAuthenticationMethodNegotiate", optional=true)
    public static native String AuthenticationMethodNegotiate();
    @GlobalValue(symbol="NSURLAuthenticationMethodClientCertificate", optional=true)
    public static native String AuthenticationMethodClientCertificate();
    @GlobalValue(symbol="NSURLAuthenticationMethodServerTrust", optional=true)
    public static native String AuthenticationMethodServerTrust();
    
    @Method(selector = "initWithHost:port:protocol:realm:authenticationMethod:")
    protected native @Pointer long initWithHost$port$protocol$realm$authenticationMethod$(String host, @MachineSizedSInt long port, String protocol, String realm, String authenticationMethod);
    @Method(selector = "initWithProxyHost:port:type:realm:authenticationMethod:")
    protected native @Pointer long initWithProxyHost$port$type$realm$authenticationMethod$(String host, @MachineSizedSInt long port, String type, String realm, String authenticationMethod);
    @Method(selector = "realm")
    public native String getRealm();
    @Method(selector = "receivesCredentialSecurely")
    public native boolean receivesCredentialSecurely();
    @Method(selector = "isProxy")
    public native boolean isProxy();
    @Method(selector = "host")
    public native String getHost();
    @Method(selector = "port")
    public native @MachineSizedSInt long getPort();
    @Method(selector = "proxyType")
    public native String getProxyType();
    @Method(selector = "protocol")
    public native String getProtocol();
    @Method(selector = "authenticationMethod")
    public native String getAuthenticationMethod();
    @Method(selector = "distinguishedNames")
    public native NSArray<?> getDistinguishedNames();
    @Method(selector = "serverTrust")
    public native SecTrust getServerTrust();
    /*</methods>*/
}
