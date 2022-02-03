.class public abstract Le/b/a/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    invoke-static {}, Le/b/a/c;->b()Le/b/a/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le/b/a/h;->b(Ljava/io/InputStream;Le/b/a/c;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Ljava/io/InputStream;Le/b/a/c;)Ljava/io/InputStream;
.end method
