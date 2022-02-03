.class public final Lcom/google/android/gms/common/api/internal/k0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lb/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/d/a<",
            "Lcom/google/android/gms/common/api/internal/j0<",
            "*>;",
            "Lc/b/a/a/b/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lb/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/d/a<",
            "Lcom/google/android/gms/common/api/internal/j0<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/b/a/a/g/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/g/e<",
            "Ljava/util/Map<",
            "Lcom/google/android/gms/common/api/internal/j0<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/internal/j0;Lc/b/a/a/b/a;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/j0<",
            "*>;",
            "Lc/b/a/a/b/a;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/k0;->a:Lb/d/a;

    invoke-virtual {v0, p1, p2}, Lb/d/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/k0;->b:Lb/d/a;

    invoke-virtual {v0, p1, p3}, Lb/d/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/gms/common/api/internal/k0;->d:I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/common/api/internal/k0;->d:I

    invoke-virtual {p2}, Lc/b/a/a/b/a;->l()Z

    move-result p1

    if-nez p1, :cond_0

    iput-boolean p3, p0, Lcom/google/android/gms/common/api/internal/k0;->e:Z

    :cond_0
    iget p1, p0, Lcom/google/android/gms/common/api/internal/k0;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/k0;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/c;

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/k0;->a:Lb/d/a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/c;-><init>(Lb/d/a;)V

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/k0;->c:Lc/b/a/a/g/e;

    invoke-virtual {p2, p1}, Lc/b/a/a/g/e;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/k0;->c:Lc/b/a/a/g/e;

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/k0;->b:Lb/d/a;

    invoke-virtual {p1, p2}, Lc/b/a/a/g/e;->c(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/internal/j0<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/k0;->a:Lb/d/a;

    invoke-virtual {v0}, Lb/d/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
