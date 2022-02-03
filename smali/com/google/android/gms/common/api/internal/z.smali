.class public final Lcom/google/android/gms/common/api/internal/z;
.super Lc/b/a/a/f/b/d;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/f$a;
.implements Lcom/google/android/gms/common/api/f$b;


# static fields
.field private static a:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "+",
            "Lc/b/a/a/f/f;",
            "Lc/b/a/a/f/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private final d:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "+",
            "Lc/b/a/a/f/f;",
            "Lc/b/a/a/f/a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/common/internal/d;

.field private g:Lc/b/a/a/f/f;

.field private h:Lcom/google/android/gms/common/api/internal/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lc/b/a/a/f/c;->c:Lcom/google/android/gms/common/api/a$a;

    sput-object v0, Lcom/google/android/gms/common/api/internal/z;->a:Lcom/google/android/gms/common/api/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/d;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/api/internal/z;->a:Lcom/google/android/gms/common/api/a$a;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/common/api/internal/z;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/d;Lcom/google/android/gms/common/api/a$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/d;Lcom/google/android/gms/common/api/a$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "Lcom/google/android/gms/common/internal/d;",
            "Lcom/google/android/gms/common/api/a$a<",
            "+",
            "Lc/b/a/a/f/f;",
            "Lc/b/a/a/f/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lc/b/a/a/f/b/d;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/z;->c:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lcom/google/android/gms/common/internal/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/d;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->f:Lcom/google/android/gms/common/internal/d;

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/d;->g()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->e:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/z;->d:Lcom/google/android/gms/common/api/a$a;

    return-void
.end method

.method private final B0(Lc/b/a/a/f/b/k;)V
    .locals 3

    invoke-virtual {p1}, Lc/b/a/a/f/b/k;->h()Lc/b/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/a/b/a;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lc/b/a/a/f/b/k;->i()Lcom/google/android/gms/common/internal/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/t;->i()Lc/b/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/a/b/a;->l()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x30

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->h:Lcom/google/android/gms/common/api/internal/c0;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/internal/c0;->b(Lc/b/a/a/b/a;)V

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/a$f;->k()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->h:Lcom/google/android/gms/common/api/internal/c0;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/t;->h()Lcom/google/android/gms/common/internal/k;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/z;->e:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/c0;->c(Lcom/google/android/gms/common/internal/k;Ljava/util/Set;)V

    goto :goto_0
.end method

.method static synthetic x0(Lcom/google/android/gms/common/api/internal/z;)Lcom/google/android/gms/common/api/internal/c0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/z;->h:Lcom/google/android/gms/common/api/internal/c0;

    return-object p0
.end method

.method static synthetic y0(Lcom/google/android/gms/common/api/internal/z;Lc/b/a/a/f/b/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/z;->B0(Lc/b/a/a/f/b/k;)V

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->k()V

    :cond_0
    return-void
.end method

.method public final Q(Lc/b/a/a/f/b/k;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->c:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/common/api/internal/b0;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/common/api/internal/b0;-><init>(Lcom/google/android/gms/common/api/internal/z;Lc/b/a/a/f/b/k;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final i(Lc/b/a/a/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->h:Lcom/google/android/gms/common/api/internal/c0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/c0;->b(Lc/b/a/a/b/a;)V

    return-void
.end method

.method public final j(I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/a$f;->k()V

    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    invoke-interface {p1, p0}, Lc/b/a/a/f/f;->b(Lc/b/a/a/f/b/e;)V

    return-void
.end method

.method public final z0(Lcom/google/android/gms/common/api/internal/c0;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->k()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->f:Lcom/google/android/gms/common/internal/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/d;->i(Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/z;->d:Lcom/google/android/gms/common/api/a$a;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/z;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/z;->f:Lcom/google/android/gms/common/internal/d;

    invoke-virtual {v5}, Lcom/google/android/gms/common/internal/d;->h()Lc/b/a/a/f/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/common/api/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/d;Ljava/lang/Object;Lcom/google/android/gms/common/api/f$a;Lcom/google/android/gms/common/api/f$b;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lc/b/a/a/f/f;

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->h:Lcom/google/android/gms/common/api/internal/c0;

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->e:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->g:Lc/b/a/a/f/f;

    invoke-interface {p1}, Lc/b/a/a/f/f;->l()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/z;->c:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/common/api/internal/a0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/internal/a0;-><init>(Lcom/google/android/gms/common/api/internal/z;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
