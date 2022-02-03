.class Le/a/a/a/b/b/a$a;
.super Ljava/io/InputStream;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/a/a/a/b/b/a;->b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private b:Z

.field private c:Ljavax/crypto/CipherInputStream;

.field final synthetic d:Le/a/a/a/b/b/e;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:[B

.field final synthetic g:Ljava/io/InputStream;

.field final synthetic h:Le/a/a/a/b/b/a;


# direct methods
.method constructor <init>(Le/a/a/a/b/b/a;Le/a/a/a/b/b/e;Ljava/lang/String;[BLjava/io/InputStream;)V
    .locals 0

    iput-object p1, p0, Le/a/a/a/b/b/a$a;->h:Le/a/a/a/b/b/a;

    iput-object p2, p0, Le/a/a/a/b/b/a$a;->d:Le/a/a/a/b/b/e;

    iput-object p3, p0, Le/a/a/a/b/b/a$a;->e:Ljava/lang/String;

    iput-object p4, p0, Le/a/a/a/b/b/a$a;->f:[B

    iput-object p5, p0, Le/a/a/a/b/b/a$a;->g:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Le/a/a/a/b/b/a$a;->b:Z

    const/4 p1, 0x0

    iput-object p1, p0, Le/a/a/a/b/b/a$a;->c:Ljavax/crypto/CipherInputStream;

    return-void
.end method

.method private a()Ljavax/crypto/CipherInputStream;
    .locals 17

    move-object/from16 v1, p0

    iget-boolean v0, v1, Le/a/a/a/b/b/a$a;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, v1, Le/a/a/a/b/b/a$a;->c:Ljavax/crypto/CipherInputStream;

    return-object v0

    :cond_0
    iget-object v0, v1, Le/a/a/a/b/b/a$a;->d:Le/a/a/a/b/b/e;

    iget-object v0, v0, Le/a/a/a/b/b/e;->d:[B

    const/4 v2, 0x0

    aget-byte v3, v0, v2

    and-int/lit16 v3, v3, 0xff

    and-int/lit8 v4, v3, 0x3f

    const/4 v5, 0x1

    aget-byte v6, v0, v5

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v7, v3, 0x6

    and-int/2addr v7, v5

    and-int/lit8 v8, v6, 0xf

    add-int/2addr v7, v8

    shr-int/lit8 v3, v3, 0x7

    and-int/2addr v3, v5

    shr-int/lit8 v6, v6, 0x4

    add-int/2addr v3, v6

    add-int/lit8 v6, v3, 0x2

    add-int v8, v6, v7

    array-length v9, v0

    if-gt v8, v9, :cond_6

    new-array v8, v3, [B

    const/4 v9, 0x2

    invoke-static {v0, v9, v8, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0x10

    new-array v0, v0, [B

    iget-object v10, v1, Le/a/a/a/b/b/a$a;->d:Le/a/a/a/b/b/e;

    iget-object v10, v10, Le/a/a/a/b/b/e;->d:[B

    invoke-static {v10, v6, v0, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v6, v1, Le/a/a/a/b/b/a$a;->f:[B

    if-eqz v6, :cond_5

    const/16 v6, 0x3f

    if-ne v4, v6, :cond_1

    const/16 v4, 0x20

    new-array v4, v4, [B

    invoke-static {v8, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v6, v1, Le/a/a/a/b/b/a$a;->f:[B

    array-length v7, v6

    rsub-int/lit8 v8, v3, 0x20

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v6, v2, v4, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_1
    :try_start_0
    const-string v3, "SHA-256"

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v6, 0x8

    new-array v7, v6, [B

    const-wide/16 v10, 0x0

    :goto_0
    const-wide/16 v12, 0x1

    shl-long v14, v12, v4

    cmp-long v16, v10, v14

    if-gez v16, :cond_4

    invoke-virtual {v3, v8}, Ljava/security/MessageDigest;->update([B)V

    iget-object v14, v1, Le/a/a/a/b/b/a$a;->f:[B

    invoke-virtual {v3, v14}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v3, v7}, Ljava/security/MessageDigest;->update([B)V

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v6, :cond_3

    aget-byte v15, v7, v14

    add-int/2addr v15, v5

    int-to-byte v15, v15

    aput-byte v15, v7, v14

    aget-byte v15, v7, v14

    if-eqz v15, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-long/2addr v10, v12

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    :goto_3
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v2, v4, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    :try_start_1
    const-string v3, "AES/CBC/NoPadding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v3, v9, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    new-instance v0, Ljavax/crypto/CipherInputStream;

    iget-object v2, v1, Le/a/a/a/b/b/a$a;->g:Ljava/io/InputStream;

    invoke-direct {v0, v2, v3}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    iput-object v0, v1, Le/a/a/a/b/b/a$a;->c:Ljavax/crypto/CipherInputStream;

    iput-boolean v5, v1, Le/a/a/a/b/b/a$a;->b:Z
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)"

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v0

    new-instance v2, Ljava/io/IOException;

    const-string v3, "SHA-256 is unsupported by your Java implementation"

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_5
    new-instance v0, Le/a/a/a/a;

    iget-object v2, v1, Le/a/a/a/b/b/a$a;->e:Ljava/lang/String;

    invoke-direct {v0, v2}, Le/a/a/a/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Salt size + IV size too long in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Le/a/a/a/b/b/a$a;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public read()I
    .locals 1

    invoke-direct {p0}, Le/a/a/a/b/b/a$a;->a()Ljavax/crypto/CipherInputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/CipherInputStream;->read()I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 1

    invoke-direct {p0}, Le/a/a/a/b/b/a$a;->a()Ljavax/crypto/CipherInputStream;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljavax/crypto/CipherInputStream;->read([BII)I

    move-result p1

    return p1
.end method
