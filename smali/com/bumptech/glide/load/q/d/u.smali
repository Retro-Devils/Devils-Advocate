.class public final Lcom/bumptech/glide/load/q/d/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/load/o/v;
.implements Lcom/bumptech/glide/load/o/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/o/v<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;",
        "Lcom/bumptech/glide/load/o/r;"
    }
.end annotation


# instance fields
.field private final b:Landroid/content/res/Resources;

.field private final c:Lcom/bumptech/glide/load/o/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/o/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/o/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lcom/bumptech/glide/load/o/v<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Lcom/bumptech/glide/load/q/d/u;->b:Landroid/content/res/Resources;

    invoke-static {p2}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/load/o/v;

    iput-object p1, p0, Lcom/bumptech/glide/load/q/d/u;->c:Lcom/bumptech/glide/load/o/v;

    return-void
.end method

.method public static g(Landroid/content/res/Resources;Lcom/bumptech/glide/load/o/v;)Lcom/bumptech/glide/load/o/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lcom/bumptech/glide/load/o/v<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/bumptech/glide/load/o/v<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/q/d/u;

    invoke-direct {v0, p0, p1}, Lcom/bumptech/glide/load/q/d/u;-><init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/o/v;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/q/d/u;->c:Lcom/bumptech/glide/load/o/v;

    instance-of v1, v0, Lcom/bumptech/glide/load/o/r;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/bumptech/glide/load/o/r;

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/r;->a()V

    :cond_0
    return-void
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/q/d/u;->c:Lcom/bumptech/glide/load/o/v;

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/v;->b()I

    move-result v0

    return v0
.end method

.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/load/q/d/u;->e()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method

.method public e()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lcom/bumptech/glide/load/q/d/u;->b:Landroid/content/res/Resources;

    iget-object v2, p0, Lcom/bumptech/glide/load/q/d/u;->c:Lcom/bumptech/glide/load/o/v;

    invoke-interface {v2}, Lcom/bumptech/glide/load/o/v;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/q/d/u;->c:Lcom/bumptech/glide/load/o/v;

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/v;->f()V

    return-void
.end method
