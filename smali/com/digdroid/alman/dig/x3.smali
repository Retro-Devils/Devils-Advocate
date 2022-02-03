.class public Lcom/digdroid/alman/dig/x3;
.super Landroidx/fragment/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/x3$c;,
        Lcom/digdroid/alman/dig/x3$b;
    }
.end annotation


# instance fields
.field private Z:Lcom/digdroid/alman/dig/x3$b;

.field private a0:Lcom/digdroid/alman/dig/x3$c;

.field b0:Ljava/lang/String;

.field c0:Ljava/lang/String;

.field d0:Ljava/lang/String;

.field e0:Ljava/lang/String;

.field f0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->e0:Ljava/lang/String;

    return-void
.end method

.method static synthetic p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/x3;->Z:Lcom/digdroid/alman/dig/x3$b;

    return-object p0
.end method


# virtual methods
.method public S0(Landroid/app/Activity;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->S0(Landroid/app/Activity;)V

    check-cast p1, Lcom/digdroid/alman/dig/x3$b;

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3;->Z:Lcom/digdroid/alman/dig/x3$b;

    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->W0(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->k2(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "zipfile"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->b0:Ljava/lang/String;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->c0:Ljava/lang/String;

    const-string v1, "name"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/x3;->d0:Ljava/lang/String;

    const-string v1, "launch"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/x3;->f0:Z

    new-instance p1, Lcom/digdroid/alman/dig/x3$c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/digdroid/alman/dig/x3$c;-><init>(Lcom/digdroid/alman/dig/x3;Lcom/digdroid/alman/dig/x3$a;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3;->a0:Lcom/digdroid/alman/dig/x3$c;

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public e1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->e1()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->Z:Lcom/digdroid/alman/dig/x3$b;

    return-void
.end method

.method public q2(Z)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->a0:Lcom/digdroid/alman/dig/x3$c;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->cancel(Z)Z

    return-void
.end method
