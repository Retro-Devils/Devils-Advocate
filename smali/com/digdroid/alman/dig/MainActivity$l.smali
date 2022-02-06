.class Lcom/digdroid/alman/dig/MainActivity$l;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/digdroid/alman/dig/MainActivity;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t;->V0()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t;->W0()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/g3;->h()V

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    const/4 v1, 0x6

    new-instance v2, Lcom/digdroid/alman/dig/MainActivity$l$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/MainActivity$l$a;-><init>(Lcom/digdroid/alman/dig/MainActivity$l;)V

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/d0;->s(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;Z)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$l;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/MainActivity;->Z2()V

    goto :goto_0

    :cond_1
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    const v1, 0x7f110135

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101d8

    new-instance v1, Lcom/digdroid/alman/dig/MainActivity$l$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/MainActivity$l$b;-><init>(Lcom/digdroid/alman/dig/MainActivity$l;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/MainActivity$l;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/MainActivity$l;->b(Ljava/lang/Boolean;)V

    return-void
.end method
