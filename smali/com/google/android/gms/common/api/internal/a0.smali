.class final Lcom/google/android/gms/common/api/internal/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/common/api/internal/z;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/z;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Lcom/google/android/gms/common/api/internal/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Lcom/google/android/gms/common/api/internal/z;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/z;->x0(Lcom/google/android/gms/common/api/internal/z;)Lcom/google/android/gms/common/api/internal/c0;

    move-result-object v0

    new-instance v1, Lc/b/a/a/b/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lc/b/a/a/b/a;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/c0;->b(Lc/b/a/a/b/a;)V

    return-void
.end method
