.class public Lc/b/a/a/e/e;
.super Lcom/google/android/gms/common/api/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/e<",
        "*>;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lc/b/a/a/e/c;->c:Lcom/google/android/gms/common/api/a;

    new-instance v1, Lcom/google/android/gms/common/api/internal/a;

    invoke-direct {v1}, Lcom/google/android/gms/common/api/internal/a;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/google/android/gms/common/api/e;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/internal/i;)V

    return-void
.end method


# virtual methods
.method public j([BLjava/lang/String;)Lc/b/a/a/g/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")",
            "Lc/b/a/a/g/d<",
            "Lc/b/a/a/e/d$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/e;->a()Lcom/google/android/gms/common/api/f;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lc/b/a/a/d/c/j;->a(Lcom/google/android/gms/common/api/f;[BLjava/lang/String;)Lcom/google/android/gms/common/api/g;

    move-result-object p1

    new-instance p2, Lc/b/a/a/e/d$a;

    invoke-direct {p2}, Lc/b/a/a/e/d$a;-><init>()V

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/q;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/j;)Lc/b/a/a/g/d;

    move-result-object p1

    return-object p1
.end method
