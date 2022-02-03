.class Lcom/bumptech/glide/load/q/h/g$a;
.super Lcom/bumptech/glide/r/j/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/q/h/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/r/j/c<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:Landroid/os/Handler;

.field final f:I

.field private final g:J

.field private h:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Landroid/os/Handler;IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/bumptech/glide/r/j/c;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/q/h/g$a;->e:Landroid/os/Handler;

    iput p2, p0, Lcom/bumptech/glide/load/q/h/g$a;->f:I

    iput-wide p3, p0, Lcom/bumptech/glide/load/q/h/g$a;->g:J

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Lcom/bumptech/glide/r/k/b;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/load/q/h/g$a;->m(Landroid/graphics/Bitmap;Lcom/bumptech/glide/r/k/b;)V

    return-void
.end method

.method public h(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/bumptech/glide/load/q/h/g$a;->h:Landroid/graphics/Bitmap;

    return-void
.end method

.method l()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/q/h/g$a;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public m(Landroid/graphics/Bitmap;Lcom/bumptech/glide/r/k/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/r/k/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bumptech/glide/load/q/h/g$a;->h:Landroid/graphics/Bitmap;

    iget-object p1, p0, Lcom/bumptech/glide/load/q/h/g$a;->e:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/q/h/g$a;->e:Landroid/os/Handler;

    iget-wide v0, p0, Lcom/bumptech/glide/load/q/h/g$a;->g:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    return-void
.end method
