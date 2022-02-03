.class Lcom/digdroid/alman/dig/r3$s;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/io/File;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field a:Lcom/digdroid/alman/dig/r3$t;

.field b:F

.field c:Landroid/widget/ImageView;

.field final synthetic d:Lcom/digdroid/alman/dig/r3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/r3;FLcom/digdroid/alman/dig/r3$t;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->d:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput p2, p0, Lcom/digdroid/alman/dig/r3$s;->b:F

    iput-object p3, p0, Lcom/digdroid/alman/dig/r3$s;->a:Lcom/digdroid/alman/dig/r3$t;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    return-void
.end method

.method public constructor <init>(Lcom/digdroid/alman/dig/r3;Landroid/widget/ImageView;FLcom/digdroid/alman/dig/r3$t;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->d:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput p3, p0, Lcom/digdroid/alman/dig/r3$s;->b:F

    iput-object p4, p0, Lcom/digdroid/alman/dig/r3$s;->a:Lcom/digdroid/alman/dig/r3$t;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 6

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v3, 0x1

    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    aget-object v4, p1, v0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    div-int v4, v1, v3

    const/16 v5, 0x640

    if-le v4, v5, :cond_1

    mul-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_1
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v2
.end method

.method protected b(Landroid/graphics/Bitmap;)V
    .locals 3

    if-eqz p1, :cond_5

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->d:Lcom/digdroid/alman/dig/r3;

    const v1, 0x7f090439

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$s;->d:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/r3;->L2(Lcom/digdroid/alman/dig/r3;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->d:Lcom/digdroid/alman/dig/r3;

    const v1, 0x7f090447

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$s;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r3;->T0:Lcom/digdroid/alman/dig/t3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t3;->p:Ljava/lang/String;

    const-string v2, "fillscreen"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    goto :goto_1

    :cond_2
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_3

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    iget v0, p0, Lcom/digdroid/alman/dig/r3$s;->b:F

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->c:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->a:Lcom/digdroid/alman/dig/r3$t;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lcom/digdroid/alman/dig/r3$t;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->a:Lcom/digdroid/alman/dig/r3$t;

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$s;->a:Lcom/digdroid/alman/dig/r3$t;

    if-eqz p1, :cond_6

    :goto_3
    invoke-interface {p1}, Lcom/digdroid/alman/dig/r3$t;->b()V

    :cond_6
    :goto_4
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r3$s;->a([Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r3$s;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method
