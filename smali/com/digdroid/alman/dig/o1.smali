.class public Lcom/digdroid/alman/dig/o1;
.super Lcom/bumptech/glide/k;
.source ""


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/k;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected A(Lcom/bumptech/glide/r/f;)V
    .locals 1

    instance-of v0, p1, Lcom/digdroid/alman/dig/m1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/m1;

    invoke-direct {v0}, Lcom/digdroid/alman/dig/m1;-><init>()V

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/m1;->h0(Lcom/bumptech/glide/r/a;)Lcom/digdroid/alman/dig/m1;

    move-result-object p1

    :goto_0
    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->A(Lcom/bumptech/glide/r/f;)V

    return-void
.end method

.method public E(Ljava/lang/Class;)Lcom/digdroid/alman/dig/n1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "Lcom/digdroid/alman/dig/n1<",
            "TResourceType;>;"
        }
    .end annotation

    new-instance v0, Lcom/digdroid/alman/dig/n1;

    iget-object v1, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    iget-object v2, p0, Lcom/bumptech/glide/k;->f:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, Lcom/digdroid/alman/dig/n1;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/k;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public F()Lcom/digdroid/alman/dig/n1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/digdroid/alman/dig/n1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/bumptech/glide/k;->m()Lcom/bumptech/glide/j;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/n1;

    return-object v0
.end method

.method public G()Lcom/digdroid/alman/dig/n1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/digdroid/alman/dig/n1<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/bumptech/glide/k;->n()Lcom/bumptech/glide/j;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/n1;

    return-object v0
.end method

.method public H(Landroid/graphics/drawable/Drawable;)Lcom/digdroid/alman/dig/n1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")",
            "Lcom/digdroid/alman/dig/n1<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->s(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/j;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/n1;

    return-object p1
.end method

.method public I(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lcom/digdroid/alman/dig/n1<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->t(Ljava/io/File;)Lcom/bumptech/glide/j;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/n1;

    return-object p1
.end method

.method public J(Ljava/lang/Integer;)Lcom/digdroid/alman/dig/n1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/digdroid/alman/dig/n1<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->u(Ljava/lang/Integer;)Lcom/bumptech/glide/j;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/n1;

    return-object p1
.end method

.method public K(Ljava/lang/String;)Lcom/digdroid/alman/dig/n1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/digdroid/alman/dig/n1<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->v(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/n1;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Class;)Lcom/bumptech/glide/j;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/o1;->E(Ljava/lang/Class;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m()Lcom/bumptech/glide/j;
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/o1;->F()Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Lcom/bumptech/glide/j;
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/o1;->G()Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    return-object v0
.end method
