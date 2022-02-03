.class public Lc/b/a/a/c/a$a;
.super Lc/b/a/a/d/b/b;
.source ""

# interfaces
.implements Lc/b/a/a/c/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/a/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-direct {p0, v0}, Lc/b/a/a/d/b/b;-><init>(Ljava/lang/String;)V

    return-void
.end method
