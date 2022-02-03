.class final Lcom/google/android/gms/common/api/internal/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/b/a;

.field private final synthetic c:Lcom/google/android/gms/common/api/internal/d$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/d$c;Lc/b/a/a/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lc/b/a/a/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lc/b/a/a/b/a;

    invoke-virtual {v0}, Lc/b/a/a/b/a;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/d$c;->e(Lcom/google/android/gms/common/api/internal/d$c;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/d$c;->d(Lcom/google/android/gms/common/api/internal/d$c;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/d$c;->f(Lcom/google/android/gms/common/api/internal/d$c;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/d$c;->d(Lcom/google/android/gms/common/api/internal/d$c;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/common/api/a$f;->h(Lcom/google/android/gms/common/internal/k;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "GoogleApiManager"

    const-string v2, "Failed to get service from broker. "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/d$c;->f:Lcom/google/android/gms/common/api/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/d;->s(Lcom/google/android/gms/common/api/internal/d;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/d$c;->h(Lcom/google/android/gms/common/api/internal/d$c;)Lcom/google/android/gms/common/api/internal/j0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/d$a;

    new-instance v1, Lc/b/a/a/b/a;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lc/b/a/a/b/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->i(Lc/b/a/a/b/a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/d$c;->f:Lcom/google/android/gms/common/api/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/d;->s(Lcom/google/android/gms/common/api/internal/d;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/u;->c:Lcom/google/android/gms/common/api/internal/d$c;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/d$c;->h(Lcom/google/android/gms/common/api/internal/d$c;)Lcom/google/android/gms/common/api/internal/j0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/d$a;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lc/b/a/a/b/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->i(Lc/b/a/a/b/a;)V

    return-void
.end method
