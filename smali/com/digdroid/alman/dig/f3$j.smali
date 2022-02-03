.class Lcom/digdroid/alman/dig/f3$j;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$j;->a:Lcom/digdroid/alman/dig/f3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$j;->a:Lcom/digdroid/alman/dig/f3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/g3;->v(Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/g3;->G(Ljava/lang/String;Z)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$j;->a:Lcom/digdroid/alman/dig/f3;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$j;->a:Lcom/digdroid/alman/dig/f3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r1;->o3()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/f3$j;->a:Lcom/digdroid/alman/dig/f3;

    iget-object v2, v1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v1

    invoke-interface {v0, p1, v2, v1}, Lcom/digdroid/alman/dig/p1$a;->q(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;I)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f3$j;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f3$j;->b(Ljava/lang/Void;)V

    return-void
.end method
