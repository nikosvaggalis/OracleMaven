package com.wlogic.client;

import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;
import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.wsee.security.saml.SAMLTrustCredentialProvider;
import weblogic.wsee.security.unt.ClientUNTCredentialProvider;
import weblogic.wsee.security.util.CertUtils;
import weblogic.security.SSL.TrustManager;

import javax.annotation.Generated;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World with WebLogic dependencies!" );
    }
}
    

