.class public Lc/b/a/a/e/d$a;
.super Lcom/google/android/gms/common/api/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/a/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/j<",
        "Lc/b/a/a/e/d$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/j;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/j;->a()Lcom/google/android/gms/common/api/k;

    move-result-object v0

    check-cast v0, Lc/b/a/a/e/d$b;

    invoke-interface {v0}, Lc/b/a/a/e/d$b;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
