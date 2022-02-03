.class public Lc/b/a/a/d/c/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/e/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/a/d/c/j$a;,
        Lc/b/a/a/d/c/j$b;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/f;[BLjava/lang/String;)Lcom/google/android/gms/common/api/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/f;",
            "[B",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/g<",
            "Lc/b/a/a/e/d$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/d/c/k;

    invoke-direct {v0, p0, p1, p2}, Lc/b/a/a/d/c/k;-><init>(Lcom/google/android/gms/common/api/f;[BLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/f;->a(Lcom/google/android/gms/common/api/internal/c;)Lcom/google/android/gms/common/api/internal/c;

    move-result-object p0

    return-object p0
.end method
