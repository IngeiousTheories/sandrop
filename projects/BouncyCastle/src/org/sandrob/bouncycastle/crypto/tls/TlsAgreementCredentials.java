package org.sandrob.bouncycastle.crypto.tls;

import java.io.IOException;

import org.sandrob.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface TlsAgreementCredentials extends TlsCredentials
{
    byte[] generateAgreement(AsymmetricKeyParameter serverPublicKey) throws IOException;
}
