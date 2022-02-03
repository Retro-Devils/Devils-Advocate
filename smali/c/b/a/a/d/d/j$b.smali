.class abstract Lc/b/a/a/d/d/j$b;
.super Lc/b/a/a/d/d/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/a/d/d/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/b/a/a/d/d/e<",
        "Lc/b/a/a/e/d$b;",
        ">;"
    }
.end annotation


# instance fields
.field protected s:Lc/b/a/a/d/d/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/a/d/d/e;-><init>(Lcom/google/android/gms/common/api/f;)V

    new-instance p1, Lc/b/a/a/d/d/l;

    invoke-direct {p1, p0}, Lc/b/a/a/d/d/l;-><init>(Lc/b/a/a/d/d/j$b;)V

    iput-object p1, p0, Lc/b/a/a/d/d/j$b;->s:Lc/b/a/a/d/d/f;

    return-void
.end method


# virtual methods
.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/k;
    .locals 2

    new-instance v0, Lc/b/a/a/d/d/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lc/b/a/a/d/d/j$a;-><init>(Lcom/google/android/gms/common/api/Status;Lc/b/a/a/e/f;)V

    return-object v0
.end method
