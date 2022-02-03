.class final Lc/b/a/a/d/d/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/e/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/a/d/d/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/common/api/Status;

.field private final c:Lc/b/a/a/e/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lc/b/a/a/e/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/a/a/d/d/j$a;->b:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lc/b/a/a/d/d/j$a;->c:Lc/b/a/a/e/f;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc/b/a/a/d/d/j$a;->c:Lc/b/a/a/e/f;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lc/b/a/a/e/f;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lc/b/a/a/d/d/j$a;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
