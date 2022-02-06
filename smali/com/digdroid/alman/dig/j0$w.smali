.class Lcom/digdroid/alman/dig/j0$w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->q3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$w;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$w;->b:Lcom/digdroid/alman/dig/j0;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/j0;->D1:Z

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/j0;->w0:Z

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/j0;->k3(Z)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$w;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/l1;->a(Landroid/content/Context;)Lcom/digdroid/alman/dig/o1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/o1;->I(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n1;->C0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n1;->T0(Z)Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    new-instance v2, Lcom/bumptech/glide/s/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "@"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/bumptech/glide/s/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/digdroid/alman/dig/n1;->R0(Lcom/bumptech/glide/load/g;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$w;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$w;->b:Lcom/digdroid/alman/dig/j0;

    iput-boolean v1, p1, Lcom/digdroid/alman/dig/j0;->v0:Z

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/j0;->A3()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$w;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/j0;->v3()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
