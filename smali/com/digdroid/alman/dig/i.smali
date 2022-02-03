.class public Lcom/digdroid/alman/dig/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/y$m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/i$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/lang/String;

.field c:Z

.field d:I

.field private e:Lcom/digdroid/alman/dig/y;

.field f:Lcom/digdroid/alman/dig/i$b;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/i;->a:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/i;->c:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/i;->d:I

    return-void
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/i;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/i;->a:Ljava/lang/ref/WeakReference;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i;->e:Lcom/digdroid/alman/dig/y;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismiss()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i;->e:Lcom/digdroid/alman/dig/y;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismiss()V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Lcom/digdroid/alman/dig/i;->f:Lcom/digdroid/alman/dig/i$b;

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/i$b;->a([Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/digdroid/alman/dig/i$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/i$a;-><init>(Lcom/digdroid/alman/dig/i;)V

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/h2;->e(Landroid/content/Context;Lcom/digdroid/alman/dig/h2$b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "saf"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const v1, 0x100c3

    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget v1, p0, Lcom/digdroid/alman/dig/i;->d:I

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/digdroid/alman/dig/y;->E()Lcom/digdroid/alman/dig/y;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/i;->e:Lcom/digdroid/alman/dig/y;

    invoke-virtual {v1, p0}, Lcom/digdroid/alman/dig/y;->J(Lcom/digdroid/alman/dig/y$m;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/i;->e:Lcom/digdroid/alman/dig/y;

    invoke-virtual {v1, p1}, Lcom/digdroid/alman/dig/y;->K(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/i;->e:Lcom/digdroid/alman/dig/y;

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/i;->c:Z

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/y;->L(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/i;->e:Lcom/digdroid/alman/dig/y;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/i;->d:I

    return-void
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/i;->c:Z

    return-void
.end method

.method public h(Lcom/digdroid/alman/dig/i$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/i;->f:Lcom/digdroid/alman/dig/i$b;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/i;->b:Ljava/lang/String;

    return-void
.end method
