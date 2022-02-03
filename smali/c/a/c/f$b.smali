.class Lc/a/c/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/c/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final b:Lc/a/c/n;

.field private final c:Lc/a/c/p;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lc/a/c/n;Lc/a/c/p;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    iput-object p2, p0, Lc/a/c/f$b;->c:Lc/a/c/p;

    iput-object p3, p0, Lc/a/c/f$b;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    invoke-virtual {v0}, Lc/a/c/n;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lc/a/c/n;->h(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc/a/c/f$b;->c:Lc/a/c/p;

    invoke-virtual {v0}, Lc/a/c/p;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    iget-object v1, p0, Lc/a/c/f$b;->c:Lc/a/c/p;

    iget-object v1, v1, Lc/a/c/p;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lc/a/c/n;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    iget-object v1, p0, Lc/a/c/f$b;->c:Lc/a/c/p;

    iget-object v1, v1, Lc/a/c/p;->c:Lc/a/c/u;

    invoke-virtual {v0, v1}, Lc/a/c/n;->d(Lc/a/c/u;)V

    :goto_0
    iget-object v0, p0, Lc/a/c/f$b;->c:Lc/a/c/p;

    iget-boolean v0, v0, Lc/a/c/p;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lc/a/c/n;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lc/a/c/f$b;->b:Lc/a/c/n;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lc/a/c/n;->h(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lc/a/c/f$b;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method
