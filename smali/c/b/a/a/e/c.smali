.class public final Lc/b/a/a/e/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g<",
            "Lc/b/a/a/d/c/m;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "Lc/b/a/a/d/c/m;",
            "*>;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a<",
            "*>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lc/b/a/a/e/d;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final e:Lc/b/a/a/e/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lc/b/a/a/e/c;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v1, Lc/b/a/a/e/p;

    invoke-direct {v1}, Lc/b/a/a/e/p;-><init>()V

    sput-object v1, Lc/b/a/a/e/c;->b:Lcom/google/android/gms/common/api/a$a;

    new-instance v2, Lcom/google/android/gms/common/api/a;

    const-string v3, "SafetyNet.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$a;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v2, Lc/b/a/a/e/c;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lc/b/a/a/d/c/j;

    invoke-direct {v0}, Lc/b/a/a/d/c/j;-><init>()V

    sput-object v0, Lc/b/a/a/e/c;->d:Lc/b/a/a/e/d;

    new-instance v0, Lc/b/a/a/d/c/n;

    invoke-direct {v0}, Lc/b/a/a/d/c/n;-><init>()V

    sput-object v0, Lc/b/a/a/e/c;->e:Lc/b/a/a/e/q;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lc/b/a/a/e/e;
    .locals 1

    new-instance v0, Lc/b/a/a/e/e;

    invoke-direct {v0, p0}, Lc/b/a/a/e/e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
