.class public abstract Lc/d/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/d/a/a$a;,
        Lc/d/a/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lc/d/a/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/d/a/a<",
            "TS;>;"
        }
    .end annotation

    new-instance v0, Lc/d/a/a$a;

    invoke-direct {v0}, Lc/d/a/a$a;-><init>()V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;)Lc/d/a/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(TS;)",
            "Lc/d/a/a<",
            "TS;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, Lc/d/a/a;->b()Lc/d/a/a;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lc/d/a/a;->d(Ljava/lang/Object;)Lc/d/a/a;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static d(Ljava/lang/Object;)Lc/d/a/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(TS;)",
            "Lc/d/a/a<",
            "TS;>;"
        }
    .end annotation

    new-instance v0, Lc/d/a/a$b;

    invoke-direct {v0, p0}, Lc/d/a/a$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lc/d/a/b;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/d/a/b<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract e()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lc/d/a/a;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
