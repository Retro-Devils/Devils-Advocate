.class Lcom/digdroid/alman/dig/j0$l;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->v3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
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
.field final synthetic a:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 7

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->A0:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->z0:Ljava/lang/String;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->y0:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/j0;->y0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/j0;->z0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    if-lez p1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v1, p1, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/j0;->Y0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".png"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v2, v1, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v2, v1, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    iput-boolean v2, v1, Lcom/digdroid/alman/dig/j0;->W0:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-boolean v2, v1, Lcom/digdroid/alman/dig/j0;->W0:Z

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/digdroid/alman/dig/j0;->b1:J

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v2, v1, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/digdroid/alman/dig/j0;->c1:J

    :cond_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v6, v6, Lcom/digdroid/alman/dig/j0;->X0:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v2, v1, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/j0;->V0:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/j0;->V0:Z

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/digdroid/alman/dig/j0;->Z0:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/digdroid/alman/dig/j0;->a1:J

    :cond_4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/j0;->w3(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->requestFocus()Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p1, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$l;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->F1:Ljava/lang/Runnable;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/j0$l;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/j0$l;->b(Ljava/lang/Boolean;)V

    return-void
.end method
