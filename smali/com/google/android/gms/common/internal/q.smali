.class public Lcom/google/android/gms/common/internal/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/internal/q$b;,
        Lcom/google/android/gms/common/internal/q$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/common/internal/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/common/internal/z;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/internal/q;->a:Lcom/google/android/gms/common/internal/q$b;

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/j;)Lc/b/a/a/g/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/k;",
            "T:",
            "Lcom/google/android/gms/common/api/j<",
            "TR;>;>(",
            "Lcom/google/android/gms/common/api/g<",
            "TR;>;TT;)",
            "Lc/b/a/a/g/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/common/internal/b0;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/internal/b0;-><init>(Lcom/google/android/gms/common/api/j;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/q;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/internal/q$a;)Lc/b/a/a/g/d;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/internal/q$a;)Lc/b/a/a/g/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/k;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/g<",
            "TR;>;",
            "Lcom/google/android/gms/common/internal/q$a<",
            "TR;TT;>;)",
            "Lc/b/a/a/g/d<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/common/internal/q;->a:Lcom/google/android/gms/common/internal/q$b;

    new-instance v1, Lc/b/a/a/g/e;

    invoke-direct {v1}, Lc/b/a/a/g/e;-><init>()V

    new-instance v2, Lcom/google/android/gms/common/internal/a0;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/google/android/gms/common/internal/a0;-><init>(Lcom/google/android/gms/common/api/g;Lc/b/a/a/g/e;Lcom/google/android/gms/common/internal/q$a;Lcom/google/android/gms/common/internal/q$b;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/g$a;)V

    invoke-virtual {v1}, Lc/b/a/a/g/e;->a()Lc/b/a/a/g/d;

    move-result-object p0

    return-object p0
.end method
