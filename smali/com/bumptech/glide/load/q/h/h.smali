.class public final Lcom/bumptech/glide/load/q/h/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/load/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/k<",
        "Lcom/bumptech/glide/n/a;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/o/a0/e;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/o/a0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/q/h/h;->a:Lcom/bumptech/glide/load/o/a0/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILcom/bumptech/glide/load/i;)Lcom/bumptech/glide/load/o/v;
    .locals 0

    check-cast p1, Lcom/bumptech/glide/n/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/q/h/h;->c(Lcom/bumptech/glide/n/a;IILcom/bumptech/glide/load/i;)Lcom/bumptech/glide/load/o/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lcom/bumptech/glide/load/i;)Z
    .locals 0

    check-cast p1, Lcom/bumptech/glide/n/a;

    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/load/q/h/h;->d(Lcom/bumptech/glide/n/a;Lcom/bumptech/glide/load/i;)Z

    move-result p1

    return p1
.end method

.method public c(Lcom/bumptech/glide/n/a;IILcom/bumptech/glide/load/i;)Lcom/bumptech/glide/load/o/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/n/a;",
            "II",
            "Lcom/bumptech/glide/load/i;",
            ")",
            "Lcom/bumptech/glide/load/o/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/bumptech/glide/n/a;->d()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/q/h/h;->a:Lcom/bumptech/glide/load/o/a0/e;

    invoke-static {p1, p2}, Lcom/bumptech/glide/load/q/d/e;->g(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/o/a0/e;)Lcom/bumptech/glide/load/q/d/e;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/bumptech/glide/n/a;Lcom/bumptech/glide/load/i;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
